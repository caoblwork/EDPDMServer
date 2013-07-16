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
package com.vrv.netmgr.vo;

import com.vrv.framework.vo.SearchCondition;

/**
 * SoftwareChange查询条件对象
 *
 * @author 曹保利
 * @version 1.0
 */
public class SoftwareChangeSearchCondition extends SearchCondition {
    /** 序列化ID */
    private static final long serialVersionUID = 7603161158625234243L;
    /** deviceId */
    private java.lang.Long deviceId = null;
    /** softCrc */
    private java.lang.Long softCrc = null;
    /** setupTime */
    private java.lang.String setupTime = null;
    /** softwareName */
    private java.lang.String softwareName = null;
    /** setupPath */
    private java.lang.String setupPath = null;
    /** findTimeBegin */
    private java.util.Date findTimeBegin = null;
    /** findTimeEnd */
    private java.util.Date findTimeEnd = null;
    /** unInstallTimeBegin */
    private java.util.Date unInstallTimeBegin = null;
    /** unInstallTimeEnd */
    private java.util.Date unInstallTimeEnd = null;
    /** suspicious */
    private Integer suspicious = null;
    /** display */
    private Integer display = null;
    /** flag */
    private java.lang.Integer flag = null;

    /**
     * @return the deviceId
     */
    public java.lang.Long getDeviceId() {
        return this.deviceId;
    }

    /**
     * @param deviceId
     *            the deviceId to set
     */
    public void setDeviceId(java.lang.Long deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * @return the softCrc
     */
    public java.lang.Long getSoftCrc() {
        return this.softCrc;
    }

    /**
     * @param softCrc
     *            the softCrc to set
     */
    public void setSoftCrc(java.lang.Long softCrc) {
        this.softCrc = softCrc;
    }

    /**
     * @return the setupTime
     */
    public java.lang.String getSetupTime() {
        return this.setupTime;
    }

    /**
     * @param setupTime
     *            the setupTime to set
     */
    public void setSetupTime(java.lang.String setupTime) {
        this.setupTime = setupTime;
    }

    /**
     * @return the softwareName
     */
    public java.lang.String getSoftwareName() {
        return this.softwareName;
    }

    /**
     * @param softwareName
     *            the softwareName to set
     */
    public void setSoftwareName(java.lang.String softwareName) {
        this.softwareName = softwareName;
    }

    /**
     * @return the setupPath
     */
    public java.lang.String getSetupPath() {
        return this.setupPath;
    }

    /**
     * @param setupPath
     *            the setupPath to set
     */
    public void setSetupPath(java.lang.String setupPath) {
        this.setupPath = setupPath;
    }

    /**
     * @return the findTimeBegin
     */
    public java.util.Date getFindTimeBegin() {
        return this.findTimeBegin;
    }

    /**
     * @param findTimeBegin
     *            the findTimeBegin to set
     */
    public void setFindTimeBegin(java.util.Date findTimeBegin) {
        this.findTimeBegin = findTimeBegin;
    }

    /**
     * @return the findTimeEnd
     */
    public java.util.Date getFindTimeEnd() {
        return this.findTimeEnd;
    }

    /**
     * @param findTimeEnd
     *            the findTimeEnd to set
     */
    public void setFindTimeEnd(java.util.Date findTimeEnd) {
        this.findTimeEnd = findTimeEnd;
    }

    /**
     * @return the unInstallTimeBegin
     */
    public java.util.Date getUnInstallTimeBegin() {
        return this.unInstallTimeBegin;
    }

    /**
     * @param unInstallTimeBegin
     *            the unInstallTimeBegin to set
     */
    public void setUnInstallTimeBegin(java.util.Date unInstallTimeBegin) {
        this.unInstallTimeBegin = unInstallTimeBegin;
    }

    /**
     * @return the unInstallTimeEnd
     */
    public java.util.Date getUnInstallTimeEnd() {
        return this.unInstallTimeEnd;
    }

    /**
     * @param unInstallTimeEnd
     *            the unInstallTimeEnd to set
     */
    public void setUnInstallTimeEnd(java.util.Date unInstallTimeEnd) {
        this.unInstallTimeEnd = unInstallTimeEnd;
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
    public java.lang.Integer getFlag() {
        return this.flag;
    }

    /**
     * @param flag
     *            the flag to set
     */
    public void setFlag(java.lang.Integer flag) {
        this.flag = flag;
    }
}
