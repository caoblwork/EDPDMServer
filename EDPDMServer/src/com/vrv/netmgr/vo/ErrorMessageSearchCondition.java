package com.vrv.netmgr.vo;

import java.util.Date;

import com.vrv.framework.vo.SearchCondition;

/**
 * ErrorMessage查询条件对象
 *
 * @author 曹保利
 * @version 1.0
 */
public class ErrorMessageSearchCondition extends SearchCondition {
    /** 序列化ID */
    private static final long serialVersionUID = -4158657860041628022L;
    /** 编号ID */
    private Long errorId = null;
    /** 设备ID */
    private Long deviceId = null;
    /** 报警时间 */
    private Date errorTime = null;
    /** 报警时间的yyyy-MM-dd **/
    private String errorTimeStr = null;
    /** 报警类型（固定的报警类型） */
    private String errorType = null;
    /** 子类事件名称（有时是客户端定义） */
    private String subName = null;
    /** 设备IP地址 */
    private String ipaddress = null;
    /** 设备IP地址1 */
    private String ipaddress1 = null;
    /** 设备MAC地址 */
    private String macAddress = null;
    /** 设备名称 */
    private String deviceName = null;
    /** 设备标识 */
    private String identify = null;
    /** 单位名称 */
    private String deptName = null;
    /** 部门名称 */
    private String officeName = null;
    /** 使用人 */
    private String userName = null;
    /** 联系电话 */
    private String tel = null;
    /** 报警信息 */
    private String errorMsg = null;
    /** 报警开始时间 */
    private Date startTime = null;
    /** 今日报警数据|以往报警数据 **/
    private String today = null;
    /** 报警结束时间 */
    private Date endTime = null;
    /** 报警持续时间 */
    private Integer duration = null;
    /** 操作系统 */
    private String sysUserName = null;
    /** 登录名称 */
    private String authUserName = null;
    /** onLineTime */
    private Long onLineTime = null;
    /** KEY登陆名称 */
    private String pkid = null;
    /** pkiUser */
    private String pkiUser = null;
    /** pkiUnit */
    private String pkiUnit = null;
    /** 是否查看 1--已查看 0--未查看 */
    private String lookFlag = null;
    /** 设备路由信息表 */
    private String routeTable = null;
    /** exField1 */
    private String exField1 = null;
    /** exField2 */
    private String exField2 = null;
    /** exField3 */
    private String exField3 = null;
    /** exField4 */
    private Integer exField4 = null;
    /**
     * 判断是否为o
     */
    private String nullDuration = null;

    /**
     * @return the errorId
     */
    public Long getErrorId() {
        return this.errorId;
    }

    /**
     * @param errorId
     *            the errorId to set
     */
    public void setErrorId(Long errorId) {
        this.errorId = errorId;
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
     * @return the errorTime
     */
    public Date getErrorTime() {
        return this.errorTime;
    }

    /**
     * @param errorTime
     *            the errorTime to set
     */
    public void setErrorTime(Date errorTime) {
        this.errorTime = errorTime;
    }

    /**
     * @return the errorType
     */
    public String getErrorType() {
        return this.errorType;
    }

    /**
     * @param errorType
     *            the errorType to set
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * @return the subName
     */
    public String getSubName() {
        return this.subName;
    }

    /**
     * @param subName
     *            the subName to set
     */
    public void setSubName(String subName) {
        this.subName = subName;
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
     * @return the ipaddress1
     */
    public String getIpaddress1() {
        return this.ipaddress1;
    }

    /**
     * @param ipaddress1
     *            the ipaddress1 to set
     */
    public void setIpaddress1(String ipaddress1) {
        this.ipaddress1 = ipaddress1;
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
     * @return the identify
     */
    public String getIdentify() {
        return this.identify;
    }

    /**
     * @param identify
     *            the identify to set
     */
    public void setIdentify(String identify) {
        this.identify = identify;
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
     * @return the officeName
     */
    public String getOfficeName() {
        return this.officeName;
    }

    /**
     * @param officeName
     *            the officeName to set
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
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
     * @return the errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @param errorMsg
     *            the errorMsg to set
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     *            the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     *            the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @param duration
     *            the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @return the sysUserName
     */
    public String getSysUserName() {
        return this.sysUserName;
    }

    /**
     * @param sysUserName
     *            the sysUserName to set
     */
    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
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
     * @return the routeTable
     */
    public String getRouteTable() {
        return this.routeTable;
    }

    /**
     * @param routeTable
     *            the routeTable to set
     */
    public void setRouteTable(String routeTable) {
        this.routeTable = routeTable;
    }

    /**
     * @return the onLineTime
     */
    public Long getOnLineTime() {
        return this.onLineTime;
    }

    /**
     * @param onLineTime
     *            the onLineTime to set
     */
    public void setOnLineTime(Long onLineTime) {
        this.onLineTime = onLineTime;
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
    public Integer getExField4() {
        return this.exField4;
    }

    /**
     * @param exField4
     *            the exField4 to set
     */
    public void setExField4(Integer exField4) {
        this.exField4 = exField4;
    }

    public String getNullDuration() {
        return nullDuration;
    }

    public void setNullDuration(String nullDuration) {
        this.nullDuration = nullDuration;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getErrorTimeStr() {
        return errorTimeStr;
    }

    public void setErrorTimeStr(String errorTimeStr) {
        this.errorTimeStr = errorTimeStr;
    }
}
