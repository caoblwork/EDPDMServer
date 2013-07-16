package com.vrv.netmgr.entity;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * Hardware实体对象
 * 
 * @author 曹保利
 * @version 1.0
 */
public class Hardware extends BaseEntity {
	/** 序列化ID */
	private static final long serialVersionUID = -4083871223215705405L;
	/** ID */
	private Long hardwareId = null;
	/** 设备ID */
	private Long deviceId = null;
	/** 设备的硬件指标名称 */
	private String hardwareName = null;
	/** 设备硬件指标信息 */
	private String hardwareDescription = null;
	/** 补充信息1 */
	private String description1 = null;
	/** 补充信息1 */
	private String description2 = null;
	/** 【未知】 */
	private Integer eqnFlag = null;
	
	/**
	 * @return the hardwareId
	 */
	public Long getHardwareId() {
		return this.hardwareId;
	}

	/**
	 * @param hardwareId
	 *            the hardwareId to set
	 */
	public void setHardwareId(Long hardwareId) {
		this.hardwareId = hardwareId;
	}

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
	 * @return the hardwareName
	 */
	public String getHardwareName() {
		return this.hardwareName;
	}

	/**
	 * @param hardwareName
	 *            the hardwareName to set
	 */
	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}

	/**
	 * @return the hardwareDescription
	 */
	public String getHardwareDescription() {
		return this.hardwareDescription;
	}

	/**
	 * @param hardwareDescription
	 *            the hardwareDescription to set
	 */
	public void setHardwareDescription(String hardwareDescription) {
		this.hardwareDescription = hardwareDescription;
	}

	/**
	 * @return the description1
	 */
	public String getDescription1() {
		return this.description1;
	}

	/**
	 * @param description1
	 *            the description1 to set
	 */
	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	/**
	 * @return the description2
	 */
	public String getDescription2() {
		return this.description2;
	}

	/**
	 * @param description2
	 *            the description2 to set
	 */
	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	/**
	 * @return the eqnFlag
	 */
	public Integer getEqnFlag() {
		return this.eqnFlag;
	}

	/**
	 * @param eqnFlag
	 *            the eqnFlag to set
	 */
	public void setEqnFlag(Integer eqnFlag) {
		this.eqnFlag = eqnFlag;
	}
}
