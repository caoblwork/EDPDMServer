package com.vrv.netmgr.vo;

import java.io.Serializable;

import com.vrv.framework.vo.SearchCondition;

/**
 * @author 曹保利
 *
 */
public class WarningInfoByDeviceSearchCondition extends SearchCondition implements Serializable {

    /**
     * serialUID
     */
    private static final long serialVersionUID = 151023105888247875L;

    /** 来自区域划分信息-区域ID */
    private Integer classId = null;

    /** 设备IP地址 */
    private String ipAddress = null;

    /** 设备ID */
    private Long deviceId = null;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

}
