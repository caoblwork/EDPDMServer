package com.vrv.netmgr.service;

import java.util.List;
import java.util.Map;

import com.vrv.framework.service.EntityService;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.SearchCondition;
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
public interface DeviceInfoService extends EntityService<DeviceInfo> {

    /**
     * 根据设备（Hardware）ID获取设备的硬件信息
     *
     * @param deviceId
     * @return
     */
    List<Hardware> getHardwareInfoByDeviceId(Long deviceId);

    /**
     * 根据设备（Equipment）ID获取设备的硬件信息
     *
     * @param deviceId
     * @return
     */
    List<Equipment> getEquipmentInfoByDeviceId(Long deviceId);

    /**
     * 分页查软件信息
     *
     * @param searchCondition
     * @return
     */
    Page searchSoftwarePage(SearchCondition searchCondition);

    /**
     * 分页查设备信息
     *
     * @param searchCondition
     * @return
     */
    Page searchjsonDeviceListPage(SearchCondition searchCondition);

    /**
     * 统计本地区的设备注册情况
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, Long>> getLocalDeviceRegisterInfo(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据操作系统统计设备资源
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getDeviceResourceByOSType(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据内存统计设备资源
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getDeviceResourceByMemery(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据CPU主频统计设备资源
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getDeviceResourceByCPUFrequency(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据CPU类型统计设备资源
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getDeviceResourceByCPUType(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据硬盘存储空间统计设备资源
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getDeviceResourceByDiskSize(DeviceInfoSearchCondition searchCondition);

    /**
     * 根据设备类型统计设备资源
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getDeviceResourceByType(DeviceInfoSearchCondition searchCondition);

    /**
     * 获取设备曾经使用的或者正在使用的ip资源
     *
     * @param searchCondition
     * @return
     */
    Page getIPInfo(DeviceInfoSearchCondition searchCondition);

    /**
     * 杀毒软件安装情况统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getKvsInstallInfo(DeviceInfoSearchCondition searchCondition);

    /**
     * ip使用情况统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getIpUseageInfo(DeviceInfoSearchCondition searchCondition);

    /**
     * 本地漏洞统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getPatchInfo(DeviceInfoSearchCondition searchCondition);

}
