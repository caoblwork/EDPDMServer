package com.vrv.netmgr.entity;

import java.util.Date;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * OsSetupLog<操作系统安装记录>实体对象
 *
 * @author 曹保利
 * @version 1.0
 */
public class OsSetupLog extends BaseEntity {
    /** 序列化ID */
    private static final long serialVersionUID = 4287962145628520117L;
    /** 设备ID */
    private Long deviceId = null;
    /** 操作系统UUID */
    private String uuid = null;
    /** 操作系统名称 */
    private String osname = null;
    /** 操作系统安装时间 */
    private Date setupTime = null;
    /** 上报时间 */
    private Date rptTime = null;
    /** 磁盘序列号 */
    private String diskSerial = null;
    /** 硬盘模式 */
    private String diskModel = null;
    /** 硬盘容量 */
    private Long diskSize = null;
    /** exField1 */
    private String exField1 = null;
    /** exField2 */
    private String exField2 = null;
    /** exField3 */
    private String exField3 = null;
    /** exField4 */
    private String exField4 = null;
    /** exField5 */
    private Integer exField5 = null;
    /** exField6 */
    private Long exField6 = null;

    /**
     * 关联对象
     */
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
     * @return the uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @param uuid
     *            the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the osname
     */
    public String getOsname() {
        return this.osname;
    }

    /**
     * @param osname
     *            the osname to set
     */
    public void setOsname(String osname) {
        this.osname = osname;
    }

    /**
     * @return the setupTime
     */
    public Date getSetupTime() {
        return this.setupTime;
    }

    /**
     * @param setupTime
     *            the setupTime to set
     */
    public void setSetupTime(Date setupTime) {
        this.setupTime = setupTime;
    }

    /**
     * @return the rptTime
     */
    public Date getRptTime() {
        return this.rptTime;
    }

    /**
     * @param rptTime
     *            the rptTime to set
     */
    public void setRptTime(Date rptTime) {
        this.rptTime = rptTime;
    }

    /**
     * @return the diskSerial
     */
    public String getDiskSerial() {
        return this.diskSerial;
    }

    /**
     * @param diskSerial
     *            the diskSerial to set
     */
    public void setDiskSerial(String diskSerial) {
        this.diskSerial = diskSerial;
    }

    /**
     * @return the diskModel
     */
    public String getDiskModel() {
        return this.diskModel;
    }

    /**
     * @param diskModel
     *            the diskModel to set
     */
    public void setDiskModel(String diskModel) {
        this.diskModel = diskModel;
    }

    /**
     * @return the diskSize
     */
    public Long getDiskSize() {
        return this.diskSize;
    }

    /**
     * @param diskSize
     *            the diskSize to set
     */
    public void setDiskSize(Long diskSize) {
        this.diskSize = diskSize;
    }

    /**
     * @return the exField1
     */
    public String getExField1() {
        return this.exField1;
    }

    /**
     * @param exField1
     *            the exField1 to set
     */
    public void setExField1(String exField1) {
        this.exField1 = exField1;
    }

    /**
     * @return the exField2
     */
    public String getExField2() {
        return this.exField2;
    }

    /**
     * @param exField2
     *            the exField2 to set
     */
    public void setExField2(String exField2) {
        this.exField2 = exField2;
    }

    /**
     * @return the exField3
     */
    public String getExField3() {
        return this.exField3;
    }

    /**
     * @param exField3
     *            the exField3 to set
     */
    public void setExField3(String exField3) {
        this.exField3 = exField3;
    }

    /**
     * @return the exField4
     */
    public String getExField4() {
        return this.exField4;
    }

    /**
     * @param exField4
     *            the exField4 to set
     */
    public void setExField4(String exField4) {
        this.exField4 = exField4;
    }

    /**
     * @return the exField5
     */
    public Integer getExField5() {
        return this.exField5;
    }

    /**
     * @param exField5
     *            the exField5 to set
     */
    public void setExField5(Integer exField5) {
        this.exField5 = exField5;
    }

    /**
     * @return the exField6
     */
    public Long getExField6() {
        return this.exField6;
    }

    /**
     * @param exField6
     *            the exField6 to set
     */
    public void setExField6(Long exField6) {
        this.exField6 = exField6;
    }

    public DeviceInfo getDevice() {
        return device;
    }

    public void setDevice(DeviceInfo device) {
        this.device = device;
    }

}
