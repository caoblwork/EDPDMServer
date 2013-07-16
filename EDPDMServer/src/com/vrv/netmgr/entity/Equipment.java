package com.vrv.netmgr.entity;

import java.util.Date;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * Equipment实体对象
 * 
 * @author 曹保利
 * @version 1.0
 */
public class Equipment extends BaseEntity {

	/** 序列化ID */
	private static final long serialVersionUID = -7690596636188361776L;
	/** equipmentId */
	private Long equipmentId = null;
	/** deviceId */
	private Long deviceId = null;
	/** equipmentName */
	private String equipmentName = null;
	/** equipmentDescription */
	private String equipmentDescription = null;
	/** description1 */
	private String description1 = null;
	/** description2 */
	private String description2 = null;
	/** eqnFlag */
	private Integer eqnFlag = null;
	/** addTime */
	private Date addTime = null;
	/** reserved1 */
	private String reserved1 = null;
	/** reserved2 */
	private String reserved2 = null;
	/** reserved3 */
	private String reserved3 = null;

	/**
	 * @return the equipmentId
	 */
	public Long getEquipmentId() {
		return this.equipmentId;
	}

	/**
	 * @param equipmentId
	 *            the equipmentId to set
	 */
	public void setEquipmentId(Long equipmentId) {
		this.equipmentId = equipmentId;
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
	 * @return the equipmentName
	 */
	public String getEquipmentName() {
		return this.equipmentName;
	}

	/**
	 * @param equipmentName
	 *            the equipmentName to set
	 */
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	/**
	 * @return the equipmentDescription
	 */
	public String getEquipmentDescription() {
		return this.equipmentDescription;
	}

	/**
	 * @param equipmentDescription
	 *            the equipmentDescription to set
	 */
	public void setEquipmentDescription(String equipmentDescription) {
		this.equipmentDescription = equipmentDescription;
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

	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return this.addTime;
	}

	/**
	 * @param addTime
	 *            the addTime to set
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
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
}
