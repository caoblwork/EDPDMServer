/*
 * Copyright 2005-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vrv.netmgr.entity;

import java.util.Date;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * HardwareChange实体对象
 *
 * @author 曹保利
 * @version 1.0
 */
public class HardwareChange extends BaseEntity {
    /** 序列化ID */
    private static final long serialVersionUID = -7352290393905683289L;
    /** 设备ID */
    private Long deviceId = null;
    /** 设备名称 */
    private String deviceName = null;
    /** 原设备 */
    private String old1 = null;
    /** 变化后设备 */
    private String new1 = null;
    /** 变化时间 */
    private Date changeTime = null;
    /** 保留1 */
    private String reserved1 = null;
    /** 保留2 */
    private String reserved2 = null;
    /** 3 */
    private String reserved3 = null;

    /**
     * 关联对象
     */
    private DeviceInfo device = null;

    /**
     * 关联对象
     
    private ErrorMessage errorMessage = null;*/

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
     * @return the changeTime
     */
    public java.util.Date getChangeTime() {
        return this.changeTime;
    }

    /**
     * @param changeTime
     *            the changeTime to set
     */
    public void setChangeTime(java.util.Date changeTime) {
        this.changeTime = changeTime;
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

    public DeviceInfo getDevice() {
        return device;
    }

    public void setDevice(DeviceInfo device) {
        this.device = device;
    }

}
