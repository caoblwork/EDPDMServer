package com.vrv.netmgr.dao;

import java.util.List;
import java.util.Map;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.netmgr.entity.DeviceInfo;
import com.vrv.netmgr.entity.Equipment;
import com.vrv.netmgr.entity.Hardware;
import com.vrv.netmgr.vo.DeviceInfoSearchCondition;

/**
 * <设备信息>实体数据库服务层
 *
 * @author 曹保利
 *
 */
public interface DeviceInfoDAO extends BaseDAO<DeviceInfo, Long> {

    /**
     * 根据设备ID获取设备的硬件信息
     *
     * @param deviceId
     * @return
     */
    List<Hardware> findHardwareInfoByDeviceId(Long deviceId);

    /**
     * 根据设备ID获取设备的硬件信息
     *
     * @param deviceId
     * @return
     */
    List<Equipment> findEquipmentInfoByDeviceId(Long deviceId);

    /**
     * 统计本地设备注册情况
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, Long>> findLocalDeviceRegisterInfo(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据操作系统类型统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findDeviceResourceByOSType(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据内存容量统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findDeviceResourceByMemery(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据CPU主频统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findDeviceResourceByCPUFrequency(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据CPU类型统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findDeviceResourceByCPUType(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据硬盘存储空间统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findDeviceResourceByDiskSize(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据设备类型统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findDeviceResourceByType(DeviceInfoSearchCondition searchCondition);

    /**
     * 杀毒软件安装情况统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findKvsInstallInfo(DeviceInfoSearchCondition searchCondition);

    /**
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findIpUseageInfo(DeviceInfoSearchCondition searchCondition);

    /**
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> searchIpRangeInfo(DeviceInfoSearchCondition searchCondition);

    /**
     * 本地漏洞统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findPatchInfo(DeviceInfoSearchCondition searchCondition);

}
