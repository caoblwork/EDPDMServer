package com.vrv.netmgr.vo;

import java.util.Date;

import com.vrv.framework.vo.SearchCondition;

/**
 * HardwareChange查询条件对象
 *
 * @author 曹保利
 * @version 1.0
 */
public class HardwareChangeSearchCondition extends SearchCondition {
    /** 序列化ID */
    private static final long serialVersionUID = -2228033240802315414L;
    /** deviceId */
    private Long deviceId = null;
    /** deviceName */
    private String deviceName = null;
    /** old1 */
    private String old1 = null;
    /** new1 */
    private String new1 = null;
    /** changeTimeBegin */
    private Date changeTimeBegin = null;
    /** changeTimeEnd */
    private Date changeTimeEnd = null;
    /** XXXX **/
    private Date changeTime = null;
    /** reserved1 */
    private String reserved1 = null;
    /** reserved2 */
    private String reserved2 = null;
    /** reserved3 */
    private String reserved3 = null;

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
     * @return the deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @param deviceName
     *            the deviceName to set
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * @return the old1
     */
    public String getOld1() {
        return this.old1;
    }

    /**
     * @param old1
     *            the old1 to set
     */
    public void setOld1(String old1) {
        this.old1 = old1;
    }

    /**
     * @return the new1
     */
    public String getNew1() {
        return this.new1;
    }

    /**
     * @param new1
     *            the new1 to set
     */
    public void setNew1(String new1) {
        this.new1 = new1;
    }

    /**
     * @return the changeTimeBegin
     */
    public java.util.Date getChangeTimeBegin() {
        return this.changeTimeBegin;
    }

    /**
     * @param changeTimeBegin
     *            the changeTimeBegin to set
     */
    public void setChangeTimeBegin(java.util.Date changeTimeBegin) {
        this.changeTimeBegin = changeTimeBegin;
    }

    /**
     * @return the changeTimeEnd
     */
    public java.util.Date getChangeTimeEnd() {
        return this.changeTimeEnd;
    }

    /**
     * @param changeTimeEnd
     *            the changeTimeEnd to set
     */
    public void setChangeTimeEnd(java.util.Date changeTimeEnd) {
        this.changeTimeEnd = changeTimeEnd;
    }

    /**
     * @return the reserved1
     */
    public String getReserved1() {
        return this.reserved1;
    }

    /**
     * @param reserved1
     *            the reserved1 to set
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * @return the reserved2
     */
    public String getReserved2() {
        return this.reserved2;
    }

    /**
     * @param reserved2
     *            the reserved2 to set
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    /**
     * @return the reserved3
     */
    public String getReserved3() {
        return this.reserved3;
    }

    /**
     * @param reserved3
     *            the reserved3 to set
     */
    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

}
