package com.vrv.netmgr.entity;

import java.util.Date;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * SoftwareChange设备软件变化实体对象
 *
 * @author 曹保利
 * @version 1.0
 */
public class SoftwareChange extends BaseEntity {
    /** 序列化ID */
    private static final long serialVersionUID = -1054870653257163283L;
    /** 设备ID */
    private Long deviceId = null;
    /** 软件CRC值 */
    private Long softCrc = null;
    /** 安装时间 */
    private String setupTime = null;
    /** 软件名称 */
    private String softwareName = null;
    /** 安装路径 */
    private String setupPath = null;
    /** 记录时间 */
    private Date findTime = null;
    /** 卸载时间 */
    private Date unInstallTime = null;
    /** 是否可疑 */
    private Integer suspicious = null;
    /** 是否信任 */
    private Integer display = null;
    /** 标识 */
    private Integer flag = null;

    /** 引用对象（软件基本信息） */
    private DeviceInfo device = null;

    /**
     * @return the deviceId
     */
    public Long getDeviceId() {
        return this.deviceId;
    }

    /**
     * @param deviceId
     *            the deviceId to set
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * @return the softCrc
     */
    public Long getSoftCrc() {
        return this.softCrc;
    }

    /**
     * @param softCrc
     *            the softCrc to set
     */
    public void setSoftCrc(Long softCrc) {
        this.softCrc = softCrc;
    }

    /**
     * @return the setupTime
     */
    public String getSetupTime() {
        return this.setupTime;
    }

    /**
     * @param setupTime
     *            the setupTime to set
     */
    public void setSetupTime(String setupTime) {
        this.setupTime = setupTime;
    }

    /**
     * @return the softwareName
     */
    public String getSoftwareName() {
        return this.softwareName;
    }

    /**
     * @param softwareName
     *            the softwareName to set
     */
    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    /**
     * @return the setupPath
     */
    public String getSetupPath() {
        return this.setupPath;
    }

    /**
     * @param setupPath
     *            the setupPath to set
     */
    public void setSetupPath(String setupPath) {
        this.setupPath = setupPath;
    }

    /**
     * @return the findTime
     */
    public Date getFindTime() {
        return this.findTime;
    }

    /**
     * @param findTime
     *            the findTime to set
     */
    public void setFindTime(Date findTime) {
        this.findTime = findTime;
    }

    /**
     * @return the unInstallTime
     */
    public Date getUnInstallTime() {
        return this.unInstallTime;
    }

    /**
     * @param unInstallTime
     *            the unInstallTime to set
     */
    public void setUnInstallTime(Date unInstallTime) {
        this.unInstallTime = unInstallTime;
    }

    /**
     * @return the suspicious
     */
    public Integer getSuspicious() {
        return this.suspicious;
    }

    /**
     * @param suspicious
     *            the suspicious to set
     */
    public void setSuspicious(Integer suspicious) {
        this.suspicious = suspicious;
    }

    /**
     * @return the display
     */
    public Integer getDisplay() {
        return this.display;
    }

    /**
     * @param display
     *            the display to set
     */
    public void setDisplay(Integer display) {
        this.display = display;
    }

    /**
     * @return the flag
     */
    public Integer getFlag() {
        return this.flag;
    }

    /**
     * @param flag
     *            the flag to set
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public DeviceInfo getDevice() {
        return device;
    }

    public void setDevice(DeviceInfo device) {
        this.device = device;
    }

}
