package com.vrv.netmgr.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.SearchCondition;
import com.vrv.netmgr.dao.DeviceInfoDAO;
import com.vrv.netmgr.entity.DeviceInfo;
import com.vrv.netmgr.entity.Equipment;
import com.vrv.netmgr.entity.Hardware;
import com.vrv.netmgr.vo.DeviceInfoSearchCondition;

/**
 * <设备信息>实体数据库服务实现
 *
 * @author 曹保利
 *
 */
@Service(value = "deviceInfoService")
public class DeviceInfoServiceImpl extends EntityServiceImpl<DeviceInfo> implements DeviceInfoService {

    @Autowired
    private DeviceInfoDAO deviceInfoDao;

    @Autowired
    @Qualifier("deviceInfoDao")
    public void setDeviceInfoDao(BaseDAO<DeviceInfo, Serializable> deviceInfoDao) {
        super.dao = deviceInfoDao;
    }

    @Override
    public List<Hardware> getHardwareInfoByDeviceId(Long deviceId) {
        return deviceInfoDao.findHardwareInfoByDeviceId(deviceId);
    }

    @Override
    public List<Equipment> getEquipmentInfoByDeviceId(Long deviceId) {
        return deviceInfoDao.findEquipmentInfoByDeviceId(deviceId);
    }

    @Override
    public Page searchSoftwarePage(SearchCondition searchCondition) {
        return deviceInfoDao.pageQuery("selectSoftwareInfo", searchCondition);
    }

    @Override
    public Page searchjsonDeviceListPage(SearchCondition searchCondition) {
        return deviceInfoDao.pageQuery("selectDeviceInfo", searchCondition);
    }

    @Override
    public List<Map<String, Long>> getLocalDeviceRegisterInfo(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findLocalDeviceRegisterInfo(searchCondition);
    }

    @Override
    public List<Map<String, String>> getDeviceResourceByOSType(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findDeviceResourceByOSType(searchCondition);
    }

    @Override
    public List<Map<String, String>> getDeviceResourceByMemery(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findDeviceResourceByMemery(searchCondition);
    }

    @Override
    public List<Map<String, String>> getDeviceResourceByCPUFrequency(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findDeviceResourceByCPUFrequency(searchCondition);
    }

    @Override
    public List<Map<String, String>> getDeviceResourceByCPUType(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findDeviceResourceByCPUType(searchCondition);
    }

    @Override
    public List<Map<String, String>> getDeviceResourceByDiskSize(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findDeviceResourceByDiskSize(searchCondition);
    }

    @Override
    public List<Map<String, String>> getDeviceResourceByType(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findDeviceResourceByType(searchCondition);
    }

    @Override
    public Page getIPInfo(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.pageQuery("selectIPInfo", searchCondition);
    }

    @Override
    public List<Map<String, String>> getKvsInstallInfo(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findKvsInstallInfo(searchCondition);
    }

    @Override
    public List<Map<String, String>> getIpUseageInfo(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findIpUseageInfo(searchCondition);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.vrv.netmgr.service.DeviceInfoService#getPatchInfo(com.vrv.netmgr.
     * vo.DeviceInfoSearchCondition)
     */
    @Override
    public List<Map<String, String>> getPatchInfo(DeviceInfoSearchCondition searchCondition) {
        return deviceInfoDao.findPatchInfo(searchCondition);
    }
}
