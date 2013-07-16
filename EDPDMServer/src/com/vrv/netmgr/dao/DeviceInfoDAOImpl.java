package com.vrv.netmgr.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.vrv.common.utils.IpUtil;
import com.vrv.common.utils.StringUtil;
import com.vrv.framework.dao.mybatis.BaseMyBatisDAOImpl;
import com.vrv.netmgr.entity.DeviceInfo;
import com.vrv.netmgr.entity.Equipment;
import com.vrv.netmgr.entity.Hardware;
import com.vrv.netmgr.vo.DeviceInfoSearchCondition;

@Repository(value = "deviceInfoDao")
public class DeviceInfoDAOImpl extends BaseMyBatisDAOImpl<DeviceInfo, Long> implements DeviceInfoDAO {

    @Override
    public List<Hardware> findHardwareInfoByDeviceId(Long deviceId) {
        String mapper = getMapperNamesapce() + ".searchHardwareInfoByDeviceId";
        return getSqlSessionTemplate().selectList(mapper, deviceId);
    }

    @Override
    public List<Equipment> findEquipmentInfoByDeviceId(Long deviceId) {
        String mapper = getMapperNamesapce() + ".searchEquipmentInfoByDeviceId";
        return getSqlSessionTemplate().selectList(mapper, deviceId);
    }

    @Override
    public List<Map<String, Long>> findLocalDeviceRegisterInfo(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".statisticsdeviceRegisterInfo";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    @Override
    public List<Map<String, String>> findDeviceResourceByOSType(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".statisticsDeviceResourceByOSType";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    @Override
    public List<Map<String, String>> findDeviceResourceByMemery(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".statisticsDeviceResourceByMemery";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    @Override
    public List<Map<String, String>> findDeviceResourceByCPUFrequency(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".statisticsDeviceResourceByCPUFrequency";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    @Override
    public List<Map<String, String>> findDeviceResourceByCPUType(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".statisticsDeviceResourceByCPUType";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    @Override
    public List<Map<String, String>> findDeviceResourceByDiskSize(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".statisticsDeviceResourceByDiskSize";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    @Override
    public List<Map<String, String>> findDeviceResourceByType(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".statisticsDeviceResourceByType";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    @Override
    public List<Map<String, String>> findKvsInstallInfo(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".statisticsKvsInstallInfo";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.vrv.netmgr.dao.DeviceInfoDAO#findIpUseageInfo(com.vrv.netmgr.vo.
     * DeviceInfoSearchCondition)
     */
    @Override
    public List<Map<String, String>> findIpUseageInfo(DeviceInfoSearchCondition searchCondition) {
        List<Map<String, String>> result1 = new ArrayList<Map<String, String>>();
        List<Map<String, String>> result2 = new ArrayList<Map<String, String>>();
        String mapper = getMapperNamesapce() + ".statisticsIpUseage";

        // ip段信息
        result2 = searchIpRangeInfo(searchCondition);
        // TODO 这里需要细化 程序有问题(不同网段的计数、多个ip段)
        String ipEndStr = result2.get(0).get("IPEnd");
        String ipStartStr = result2.get(0).get("IPStart");

        // ip统计信息
        logger.debug("ipStartStr:" + ipStartStr);
        logger.debug("ipEndStr  :" + ipEndStr);
        searchCondition.setStartNumIpAddress(IpUtil.ipToLong(ipStartStr));
        searchCondition.setEndNumIpAddress(IpUtil.ipToLong(ipEndStr));
        result1 = getSqlSessionTemplate().selectList(mapper, searchCondition);
        Map<String, String> varMap = result1.get(0);

        // ip总数
        long ipCount = IpUtil.ipToLong(ipEndStr) - IpUtil.ipToLong(ipStartStr) + 1;
        long unRegistered = 0L, registered = 0L;
        if (StringUtil.isValidString(String.valueOf(varMap.get("unRegistered"))) && !"null".equals(String.valueOf(varMap.get("unRegistered")))) {
            unRegistered = Long.parseLong(String.valueOf(varMap.get("unRegistered")));
        }
        if (StringUtil.isValidString(String.valueOf(varMap.get("registered"))) && !"null".equals(String.valueOf(varMap.get("registered")))) {
            registered = Long.parseLong(String.valueOf(varMap.get("registered")));
        }

        varMap.clear();
        varMap.put("unRegistered", String.format("%.2f", (1.00 * unRegistered / ipCount) * 100));
        varMap.put("registered", String.format("%.2f", (1.00 * registered / ipCount) * 100));
        varMap.put("idle", String.format("%.2f", (1.00 * (ipCount - registered - unRegistered) / ipCount) * 100));

        varMap.put("unRegisteredNum", String.valueOf(unRegistered));
        varMap.put("registeredNum", String.valueOf(registered));
        varMap.put("idleNum", String.valueOf(ipCount - registered - unRegistered));

        result1.clear();
        result1.add(varMap);
        return result1;
    }

    @Override
    public List<Map<String, String>> searchIpRangeInfo(DeviceInfoSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".searchIpRangeInfo";
        return getSqlSessionTemplate().selectList(mapper, searchCondition);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.vrv.netmgr.dao.DeviceInfoDAO#findPatchInfo(com.vrv.netmgr.vo.
     * DeviceInfoSearchCondition)
     */
    @Override
    public List<Map<String, String>> findPatchInfo(DeviceInfoSearchCondition searchCondition) {

        String mapper = getMapperNamesapce() + ".searchPatchInfo";
        List<Map<String, Number>> rawData = getSqlSessionTemplate().selectList(mapper, searchCondition);

        // 初始化UI显示集合
        List<Map<String, String>> valList = new ArrayList<Map<String, String>>();
        Map<String, String> valMap = new HashMap<String, String>();
        valMap.put("HRisk", "0");
        valMap.put("MRisk", "0");
        valMap.put("LRisk", "0");

        for (Map<String, Number> map : rawData) {
            int type = map.get("type").intValue();
            switch (type) {
                case 2:
                    valMap.put("HRisk", String.valueOf(map.get("Num")));
                    break;
                case 1:
                    valMap.put("MRisk", String.valueOf(map.get("Num")));
                    break;
                case 0:
                    valMap.put("LRisk", String.valueOf(map.get("Num")));
                    break;

                default:
                    break;
            }
        }

        valList.add(valMap);
        return valList;
    }

}
