package com.vrv.netmgr.vo;

import java.util.Date;

import com.vrv.framework.vo.SearchCondition;

/**
 * PmoveableDiskEvent查询条件对象
 * 
 * @author 曹保利
 * @version 1.0
 */
public class PmoveableDiskEventSearchCondition extends SearchCondition {

	/** 序列化ID */
	private static final long serialVersionUID = -3989193360546277315L;
	/** 事件ID */
	private Integer peventId = null;

	/** 设备ID */
	private Long onlyId = null;

	/** 设备名称 */
	private String deviceName = null;

	/** 设备IP地址 */
	private String ipaddress = null;

	/** 数字IP地址 */
	private Long ipnum = null;

	/** 设备MAC地址 */
	private String macAddress = null;

	/** 区域ID */
	private Integer classId = null;

	/** 区域名称 */
	private String className = null;

	/** 单位 */
	private String unitName = null;

	/** 部门 */
	private String deptName = null;

	/** 使用人 */
	private String userName = null;

	/** 联系电话 */
	private String tel = null;

	/** U盘单位 */
	private String udiskUnit = null;

	/** U盘部门 */
	private String udiskDept = null;

	/** 策略ID */
	private Integer policyId = null;

	/** 策略名称 */
	private String policyName = null;

	/** 审计类型大类ID */
	private Integer auditTypeBigNum = null;

	/** 审计类型ID */
	private Integer extNum = null;

	/** 发生时间 */
	private Integer yearMonth = null;

	/** 违规描述 */
	private String description = null;

	/** 上报时间 */
	private Date upTime = null;

	/** 客户端发生时间 */
	private Date clientTime = null;

	/** 操作系统登录名称 */
	private String authUserName = null;

	/** 是否查看 */
	private String lookFlag = null;

	/** exField1 */
	private String exField1 = null;
	/** exField2 */
	private String exField2 = null;
	/** exField3 */
	private Long exField3 = null;
	/** exField4 */
	private Date exField4 = null;
	/** exField5 */
	private Date exField5 = null;
	/** exField6 */
	private String exField6 = null;
	/** exField7 */
	private String exField7 = null;
	/** exField8 */
	private String exField8 = null;
	/** reserved1 */
	private Long reserved1 = null;
	/** reserved2 */
	private String reserved2 = null;

	/** pkid */
	private String pkid = null;
	/** pkiUser */
	private String pkiUser = null;
	/** pkiUnit */
	private String pkiUnit = null;

	/**
	 * @return the peventId
	 */
	public Integer getPeventId() {
		return this.peventId;
	}

	/**
	 * @param peventId
	 *            the peventId to set
	 */
	public void setPeventId(Integer peventId) {
		this.peventId = peventId;
	}

	/**
	 * @return the onlyId
	 */
	public Long getOnlyId() {
		return this.onlyId;
	}

	/**
	 * @param onlyId
	 *            the onlyId to set
	 */
	public void setOnlyId(Long onlyId) {
		this.onlyId = onlyId;
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
	 * @return the ipaddress
	 */
	public String getIpaddress() {
		return this.ipaddress;
	}

	/**
	 * @param ipaddress
	 *            the ipaddress to set
	 */
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * @return the ipnum
	 */
	public Long getIpnum() {
		return this.ipnum;
	}

	/**
	 * @param ipnum
	 *            the ipnum to set
	 */
	public void setIpnum(Long ipnum) {
		this.ipnum = ipnum;
	}

	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return this.macAddress;
	}

	/**
	 * @param macAddress
	 *            the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return the classId
	 */
	public Integer getClassId() {
		return this.classId;
	}

	/**
	 * @param classId
	 *            the classId to set
	 */
	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return this.className;
	}

	/**
	 * @param className
	 *            the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the unitName
	 */
	public String getUnitName() {
		return this.unitName;
	}

	/**
	 * @param unitName
	 *            the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return this.deptName;
	}

	/**
	 * @param deptName
	 *            the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return this.tel;
	}

	/**
	 * @param tel
	 *            the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the udiskUnit
	 */
	public String getUdiskUnit() {
		return this.udiskUnit;
	}

	/**
	 * @param udiskUnit
	 *            the udiskUnit to set
	 */
	public void setUdiskUnit(String udiskUnit) {
		this.udiskUnit = udiskUnit;
	}

	/**
	 * @return the udiskDept
	 */
	public String getUdiskDept() {
		return this.udiskDept;
	}

	/**
	 * @param udiskDept
	 *            the udiskDept to set
	 */
	public void setUdiskDept(String udiskDept) {
		this.udiskDept = udiskDept;
	}

	/**
	 * @return the policyId
	 */
	public Integer getPolicyId() {
		return this.policyId;
	}

	/**
	 * @param policyId
	 *            the policyId to set
	 */
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	/**
	 * @return the policyName
	 */
	public String getPolicyName() {
		return this.policyName;
	}

	/**
	 * @param policyName
	 *            the policyName to set
	 */
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	/**
	 * @return the auditTypeBigNum
	 */
	public Integer getAuditTypeBigNum() {
		return this.auditTypeBigNum;
	}

	/**
	 * @param auditTypeBigNum
	 *            the auditTypeBigNum to set
	 */
	public void setAuditTypeBigNum(Integer auditTypeBigNum) {
		this.auditTypeBigNum = auditTypeBigNum;
	}

	/**
	 * @return the extNum
	 */
	public Integer getExtNum() {
		return this.extNum;
	}

	/**
	 * @param extNum
	 *            the extNum to set
	 */
	public void setExtNum(Integer extNum) {
		this.extNum = extNum;
	}

	/**
	 * @return the yearMonth
	 */
	public Integer getYearMonth() {
		return this.yearMonth;
	}

	/**
	 * @param yearMonth
	 *            the yearMonth to set
	 */
	public void setYearMonth(Integer yearMonth) {
		this.yearMonth = yearMonth;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the upTime
	 */
	public Date getUpTime() {
		return this.upTime;
	}

	/**
	 * @param upTime
	 *            the upTime to set
	 */
	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}

	/**
	 * @return the clientTime
	 */
	public Date getClientTime() {
		return this.clientTime;
	}

	/**
	 * @param clientTime
	 *            the clientTime to set
	 */
	public void setClientTime(Date clientTime) {
		this.clientTime = clientTime;
	}

	/**
	 * @return the authUserName
	 */
	public String getAuthUserName() {
		return this.authUserName;
	}

	/**
	 * @param authUserName
	 *            the authUserName to set
	 */
	public void setAuthUserName(String authUserName) {
		this.authUserName = authUserName;
	}

	/**
	 * @return the lookFlag
	 */
	public String getLookFlag() {
		return this.lookFlag;
	}

	/**
	 * @param lookFlag
	 *            the lookFlag to set
	 */
	public void setLookFlag(String lookFlag) {
		this.lookFlag = lookFlag;
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
	public Long getExField3() {
		return this.exField3;
	}

	/**
	 * @param exField3
	 *            the exField3 to set
	 */
	public void setExField3(Long exField3) {
		this.exField3 = exField3;
	}

	/**
	 * @return the exField4
	 */
	public Date getExField4() {
		return this.exField4;
	}

	/**
	 * @param exField4
	 *            the exField4 to set
	 */
	public void setExField4(Date exField4) {
		this.exField4 = exField4;
	}

	/**
	 * @return the exField5
	 */
	public Date getExField5() {
		return this.exField5;
	}

	/**
	 * @param exField5
	 *            the exField5 to set
	 */
	public void setExField5(Date exField5) {
		this.exField5 = exField5;
	}

	/**
	 * @return the reserved1
	 */
	public Long getReserved1() {
		return this.reserved1;
	}

	/**
	 * @param reserved1
	 *            the reserved1 to set
	 */
	public void setReserved1(Long reserved1) {
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
	 * @return the pkid
	 */
	public String getPkid() {
		return this.pkid;
	}

	/**
	 * @param pkid
	 *            the pkid to set
	 */
	public void setPkid(String pkid) {
		this.pkid = pkid;
	}

	/**
	 * @return the pkiUser
	 */
	public String getPkiUser() {
		return this.pkiUser;
	}

	/**
	 * @param pkiUser
	 *            the pkiUser to set
	 */
	public void setPkiUser(String pkiUser) {
		this.pkiUser = pkiUser;
	}

	/**
	 * @return the pkiUnit
	 */
	public String getPkiUnit() {
		return this.pkiUnit;
	}

	/**
	 * @param pkiUnit
	 *            the pkiUnit to set
	 */
	public void setPkiUnit(String pkiUnit) {
		this.pkiUnit = pkiUnit;
	}

	/**
	 * @return the exField6
	 */
	public String getExField6() {
		return this.exField6;
	}

	/**
	 * @param exField6
	 *            the exField6 to set
	 */
	public void setExField6(String exField6) {
		this.exField6 = exField6;
	}

	/**
	 * @return the exField7
	 */
	public String getExField7() {
		return this.exField7;
	}

	/**
	 * @param exField7
	 *            the exField7 to set
	 */
	public void setExField7(String exField7) {
		this.exField7 = exField7;
	}

	/**
	 * @return the exField8
	 */
	public String getExField8() {
		return this.exField8;
	}

	/**
	 * @param exField8
	 *            the exField8 to set
	 */
	public void setExField8(String exField8) {
		this.exField8 = exField8;
	}
}
