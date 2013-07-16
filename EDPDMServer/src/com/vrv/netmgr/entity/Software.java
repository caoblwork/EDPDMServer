package com.vrv.netmgr.entity;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * Software实体对象
 * 
 * @author 曹保利
 * @version 1.0
 */
public class Software extends BaseEntity {

	/** 序列化ID */
	private static final long serialVersionUID = 4321772614711506049L;
	/** softwareId */
	private java.lang.Long softwareId = null;
	/** deviceId */
	private java.lang.Long deviceId = null;
	/** 软件生命周期 */
	private java.lang.Long softCrc = null;
	/** 安装时间 */
	private java.lang.String setupTime = null;
	/** 软件名称 */
	private java.lang.String softwareName = null;
	/** 软件版本信息 */
	private java.lang.String versionInfo = null;
	/** 安装路径 */
	private java.lang.String setupPath = null;
	/** 首次检测时间 */
	private java.util.Date findTime = null;
	/** 是否可疑 */
	private Integer suspicious = null;
	/** 是否信任 */
	private Integer display = null;
	/** 安装的终端数量 */
	private Long clientSetupNum = null;

	/**
	 * @return the softwareId
	 */
	public java.lang.Long getSoftwareId() {
		return this.softwareId;
	}

	/**
	 * @param softwareId
	 *            the softwareId to set
	 */
	public void setSoftwareId(java.lang.Long softwareId) {
		this.softwareId = softwareId;
	}

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
	 * @return the findTime
	 */
	public java.util.Date getFindTime() {
		return this.findTime;
	}

	/**
	 * @param findTime
	 *            the findTime to set
	 */
	public void setFindTime(java.util.Date findTime) {
		this.findTime = findTime;
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

	public Long getClientSetupNum() {
		return clientSetupNum;
	}

	public void setClientSetupNum(Long clientSetupNum) {
		this.clientSetupNum = clientSetupNum;
	}

	public java.lang.String getVersionInfo() {
		return versionInfo;
	}

	public void setVersionInfo(java.lang.String versionInfo) {
		this.versionInfo = versionInfo;
	}

}
