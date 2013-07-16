package com.vrv.netmgr.vo;

import java.util.Date;

import com.vrv.framework.vo.SearchCondition;

/**
 * DeviceLog查询条件对象
 *
 * @author 曹保利
 * @version 1.0
 */
public class DeviceLogSearchCondition extends SearchCondition {

    /** 序列化ID */
    private static final long serialVersionUID = -5808305345294071991L;

    /** logType */
    private Integer logType = null;
    /** logTimeBegin */
    private Date logTimeBegin = null;
    /** */
    private String logTime = null;
    /** logTimeEnd */
    private Date logTimeEnd = null;
    /** deviceId */
    private Long deviceId = null;
    /** devOnlyId */
    private Long devOnlyId = null;
    /** onlyId */
    private Long onlyId = null;
    /** classId */
    private Integer classId = null;
    /** contrlId */
    private Integer contrlId = null;
    /** deviceCode */
    private String deviceCode = null;
    /** regId */
    private Integer regId = null;
    /** deptName */
    private String deptName = null;
    /** officeName */
    private String officeName = null;
    /** floorNumber */
    private String floorNumber = null;
    /** roomNumber */
    private String roomNumber = null;
    /** subOffice */
    private String subOffice = null;
    /** userName */
    private String userName = null;
    /** deviceName */
    private String deviceName = null;
    /** aliasName */
    private String aliasName = null;
    /** switchId */
    private Long switchId = null;
    /** switchName */
    private String switchName = null;
    /** switchIp */
    private String switchIp = null;
    /** switchPort */
    private String switchPort = null;
    /** portDescr */
    private String portDescr = null;
    /** ostype */
    private String ostype = null;
    /** osLanguage */
    private String osLanguage = null;
    /** spNumber */
    private String spNumber = null;
    /** ieversion */
    private String ieversion = null;
    /** cpuType */
    private String cpuType = null;
    /** cpuSerial */
    private String cpuSerial = null;
    /** numIpaddress */
    private Long numIpaddress = null;
    /** hardware1 */
    private Long hardware1 = null;
    /** hardware2 */
    private Long hardware2 = null;
    /** ipaddres */
    private String ipaddres = null;
    /** macAddress */
    private String macAddress = null;
    /** routeIpaddress */
    private String routeIpaddress = null;
    /** netWork */
    private String netWork = null;
    /** cpu */
    private Integer cpu = null;
    /** memory */
    private Integer memory = null;
    /** diskSize */
    private Integer diskSize = null;
    /** other */
    private Integer other = null;
    /** tel */
    private String tel = null;
    /** email */
    private String email = null;
    /** logonUserName */
    private String logonUserName = null;
    /** domainName */
    private String domainName = null;
    /** identify */
    private Long identify = null;
    /** allowDail */
    private Integer allowDail = null;
    /** registerTimeBegin */
    private Date registerTimeBegin = null;
    /** registerTimeEnd */
    private Date registerTimeEnd = null;
    /** lastTimeBegin */
    private Date lastTimeBegin = null;
    /** lastTimeEnd */
    private Date lastTimeEnd = null;
    /** attackTimeBegin */
    private Date attackTimeBegin = null;
    /** attackTimeEnd */
    private Date attackTimeEnd = null;
    /** reportTimeBegin */
    private Date reportTimeBegin = null;
    /** reportTimeEnd */
    private Date reportTimeEnd = null;
    /** unInstallTimeBegin */
    private Date unInstallTimeBegin = null;
    /** unInstallTimeEnd */
    private Date unInstallTimeEnd = null;
    /** idleTimeBegin */
    private Date idleTimeBegin = null;
    /** idleTimeEnd */
    private Date idleTimeEnd = null;
    /** bootTimeBegin */
    private Date bootTimeBegin = null;
    /** bootTimeEnd */
    private Date bootTimeEnd = null;
    /** protectEndTimeBegin */
    private Date protectEndTimeBegin = null;
    /** protectEndTimeEnd */
    private Date protectEndTimeEnd = null;
    /** lockedEndTimeBegin */
    private Date lockedEndTimeBegin = null;
    /** lockedEndTimeEnd */
    private Date lockedEndTimeEnd = null;
    /** onlineTime */
    private Long onlineTime = null;
    /** totalTime */
    private Long totalTime = null;
    /** dayTime */
    private Long dayTime = null;
    /** runStatus */
    private Integer runStatus = null;
    /** registered */
    private Integer registered = null;
    /** agentVersion */
    private String agentVersion = null;
    /** kvsCompany */
    private String kvsCompany = null;
    /** kvsVersion */
    private String kvsVersion = null;
    /** aclCtrl */
    private String aclCtrl = null;
    /** serviceNo */
    private String serviceNo = null;
    /** diskSerial */
    private String diskSerial = null;
    /** productId */
    private String productId = null;
    /** countPatchLevel0 */
    private Integer countPatchLevel0 = null;
    /** countPatchLevel1 */
    private Integer countPatchLevel1 = null;
    /** countPatchLevel2 */
    private Integer countPatchLevel2 = null;
    /** countPatchLevel3 */
    private Integer countPatchLevel3 = null;
    /** countPatchLevel4 */
    private Integer countPatchLevel4 = null;
    /** validDay */
    private Integer validDay = null;
    /** protect */
    private Integer protect = null;
    /** locked */
    private Integer locked = null;
    /** forceout */
    private Integer forceout = null;
    /** runLevel */
    private Integer runLevel = null;
    /** deviceStatus */
    private Integer deviceStatus = null;
    /** isLocal */
    private Integer isLocal = null;
    /** reserved1 */
    private Integer reserved1 = null;
    /** reserved2 */
    private Integer reserved2 = null;
    /** reserved3 */
    private Integer reserved3 = null;
    /** reserved4 */
    private Integer reserved4 = null;
    /** reserved5 */
    private Integer reserved5 = null;
    /** reserved6 */
    private Integer reserved6 = null;
    /** reserved7 */
    private Integer reserved7 = null;
    /** reserved8 */
    private Integer reserved8 = null;
    /** migrate */
    private Integer migrate = null;
    /** migrateRegIp */
    private String migrateRegIp = null;
    /** migrateUnitName */
    private String migrateUnitName = null;
    /** migrateTimeBegin */
    private Date migrateTimeBegin = null;
    /** migrateTimeEnd */
    private Date migrateTimeEnd = null;
    /** policemenKind */
    private String policemenKind = null;
    /** intelAmtmode */
    private Integer intelAmtmode = null;
    /** intelAmtip */
    private String intelAmtip = null;
    /** isIntelAmt */
    private Integer isIntelAmt = null;
    /** amtuuid */
    private String amtuuid = null;
    /** amtversion */
    private String amtversion = null;
    /** regip */
    private String regip = null;
    /** firwallStatus */
    private String firwallStatus = null;
    /** description */
    private String description = null;
    /** computerManufacturer */
    private String computerManufacturer = null;
    /** computerModel */
    private String computerModel = null;
    /** externalDevice */
    private String externalDevice = null;
    /** externalDeviceModel */
    private String externalDeviceModel = null;
    /** roomSerial */
    private String roomSerial = null;
    /** deviceNumber */
    private String deviceNumber = null;
    /** deviceDesc */
    private String deviceDesc = null;
    /** fwPolicy */
    private String fwPolicy = null;
    /** allOss */
    private String allOss = null;
    /** setupTmosBegin */
    private Date setupTmosBegin = null;
    /** setupTmosEnd */
    private Date setupTmosEnd = null;
    /** osversion */
    private String osversion = null;
    /** pki */
    private String pki = null;
    /** healthScore */
    private Integer healthScore = null;
    /** healthTimeBegin */
    private Date healthTimeBegin = null;
    /** healthTimeEnd */
    private Date healthTimeEnd = null;
    /** synStatus */
    private Integer synStatus = null;
    /** activeNetCard */
    private String activeNetCard = null;
    /** pkid */
    private String pkid = null;
    /** pkiUser */
    private String pkiUser = null;
    /** pkiUnit */
    private String pkiUnit = null;
    /** actUser */
    private String actUser = null;
    /** loginCount */
    private Integer loginCount = null;
    /** tioStatus */
    private Integer tioStatus = null;
    /** separateFlag */
    private Integer separateFlag = null;
    /** manualTag */
    private Integer manualTag = null;
    /** regionCode */
    private String regionCode = null;
    /** exField1 */
    private String exField1 = null;
    /** exField2 */
    private String exField2 = null;
    /** exField3 */
    private String exField3 = null;
    /** exField4 */
    private Integer exField4 = null;
    /** exField5 */
    private Integer exField5 = null;

    /**
     * @return the logType
     */
    public Integer getLogType() {
        return this.logType;
    }

    /**
     * @param logType
     *            the logType to set
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * @return the logTimeBegin
     */
    public Date getLogTimeBegin() {
        return this.logTimeBegin;
    }

    /**
     * @param logTimeBegin
     *            the logTimeBegin to set
     */
    public void setLogTimeBegin(Date logTimeBegin) {
        this.logTimeBegin = logTimeBegin;
    }

    /**
     * @return the logTimeEnd
     */
    public Date getLogTimeEnd() {
        return this.logTimeEnd;
    }

    /**
     * @param logTimeEnd
     *            the logTimeEnd to set
     */
    public void setLogTimeEnd(Date logTimeEnd) {
        this.logTimeEnd = logTimeEnd;
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
     * @return the devOnlyId
     */
    public Long getDevOnlyId() {
        return this.devOnlyId;
    }

    /**
     * @param devOnlyId
     *            the devOnlyId to set
     */
    public void setDevOnlyId(Long devOnlyId) {
        this.devOnlyId = devOnlyId;
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
     * @return the contrlId
     */
    public Integer getContrlId() {
        return this.contrlId;
    }

    /**
     * @param contrlId
     *            the contrlId to set
     */
    public void setContrlId(Integer contrlId) {
        this.contrlId = contrlId;
    }

    /**
     * @return the deviceCode
     */
    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * @param deviceCode
     *            the deviceCode to set
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * @return the regId
     */
    public Integer getRegId() {
        return this.regId;
    }

    /**
     * @param regId
     *            the regId to set
     */
    public void setRegId(Integer regId) {
        this.regId = regId;
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
     * @return the floorNumber
     */
    public String getFloorNumber() {
        return this.floorNumber;
    }

    /**
     * @param floorNumber
     *            the floorNumber to set
     */
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * @param roomNumber
     *            the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the subOffice
     */
    public String getSubOffice() {
        return this.subOffice;
    }

    /**
     * @param subOffice
     *            the subOffice to set
     */
    public void setSubOffice(String subOffice) {
        this.subOffice = subOffice;
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
     * @return the aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @param aliasName
     *            the aliasName to set
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * @return the switchId
     */
    public Long getSwitchId() {
        return this.switchId;
    }

    /**
     * @param switchId
     *            the switchId to set
     */
    public void setSwitchId(Long switchId) {
        this.switchId = switchId;
    }

    /**
     * @return the switchName
     */
    public String getSwitchName() {
        return this.switchName;
    }

    /**
     * @param switchName
     *            the switchName to set
     */
    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    /**
     * @return the switchIp
     */
    public String getSwitchIp() {
        return this.switchIp;
    }

    /**
     * @param switchIp
     *            the switchIp to set
     */
    public void setSwitchIp(String switchIp) {
        this.switchIp = switchIp;
    }

    /**
     * @return the switchPort
     */
    public String getSwitchPort() {
        return this.switchPort;
    }

    /**
     * @param switchPort
     *            the switchPort to set
     */
    public void setSwitchPort(String switchPort) {
        this.switchPort = switchPort;
    }

    /**
     * @return the portDescr
     */
    public String getPortDescr() {
        return this.portDescr;
    }

    /**
     * @param portDescr
     *            the portDescr to set
     */
    public void setPortDescr(String portDescr) {
        this.portDescr = portDescr;
    }

    /**
     * @return the ostype
     */
    public String getOstype() {
        return this.ostype;
    }

    /**
     * @param ostype
     *            the ostype to set
     */
    public void setOstype(String ostype) {
        this.ostype = ostype;
    }

    /**
     * @return the osLanguage
     */
    public String getOsLanguage() {
        return this.osLanguage;
    }

    /**
     * @param osLanguage
     *            the osLanguage to set
     */
    public void setOsLanguage(String osLanguage) {
        this.osLanguage = osLanguage;
    }

    /**
     * @return the spNumber
     */
    public String getSpNumber() {
        return this.spNumber;
    }

    /**
     * @param spNumber
     *            the spNumber to set
     */
    public void setSpNumber(String spNumber) {
        this.spNumber = spNumber;
    }

    /**
     * @return the ieversion
     */
    public String getIeversion() {
        return this.ieversion;
    }

    /**
     * @param ieversion
     *            the ieversion to set
     */
    public void setIeversion(String ieversion) {
        this.ieversion = ieversion;
    }

    /**
     * @return the cpuType
     */
    public String getCpuType() {
        return this.cpuType;
    }

    /**
     * @param cpuType
     *            the cpuType to set
     */
    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    /**
     * @return the cpuSerial
     */
    public String getCpuSerial() {
        return this.cpuSerial;
    }

    /**
     * @param cpuSerial
     *            the cpuSerial to set
     */
    public void setCpuSerial(String cpuSerial) {
        this.cpuSerial = cpuSerial;
    }

    /**
     * @return the numIpaddress
     */
    public Long getNumIpaddress() {
        return this.numIpaddress;
    }

    /**
     * @param numIpaddress
     *            the numIpaddress to set
     */
    public void setNumIpaddress(Long numIpaddress) {
        this.numIpaddress = numIpaddress;
    }

    /**
     * @return the hardware1
     */
    public Long getHardware1() {
        return this.hardware1;
    }

    /**
     * @param hardware1
     *            the hardware1 to set
     */
    public void setHardware1(Long hardware1) {
        this.hardware1 = hardware1;
    }

    /**
     * @return the hardware2
     */
    public Long getHardware2() {
        return this.hardware2;
    }

    /**
     * @param hardware2
     *            the hardware2 to set
     */
    public void setHardware2(Long hardware2) {
        this.hardware2 = hardware2;
    }

    /**
     * @return the ipaddres
     */
    public String getIpaddres() {
        return this.ipaddres;
    }

    /**
     * @param ipaddres
     *            the ipaddres to set
     */
    public void setIpaddres(String ipaddres) {
        this.ipaddres = ipaddres;
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
     * @return the routeIpaddress
     */
    public String getRouteIpaddress() {
        return this.routeIpaddress;
    }

    /**
     * @param routeIpaddress
     *            the routeIpaddress to set
     */
    public void setRouteIpaddress(String routeIpaddress) {
        this.routeIpaddress = routeIpaddress;
    }

    /**
     * @return the netWork
     */
    public String getNetWork() {
        return this.netWork;
    }

    /**
     * @param netWork
     *            the netWork to set
     */
    public void setNetWork(String netWork) {
        this.netWork = netWork;
    }

    /**
     * @return the cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @param cpu
     *            the cpu to set
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * @return the memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @param memory
     *            the memory to set
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * @return the diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @param diskSize
     *            the diskSize to set
     */
    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    /**
     * @return the other
     */
    public Integer getOther() {
        return this.other;
    }

    /**
     * @param other
     *            the other to set
     */
    public void setOther(Integer other) {
        this.other = other;
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
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the logonUserName
     */
    public String getLogonUserName() {
        return this.logonUserName;
    }

    /**
     * @param logonUserName
     *            the logonUserName to set
     */
    public void setLogonUserName(String logonUserName) {
        this.logonUserName = logonUserName;
    }

    /**
     * @return the domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     *            the domainName to set
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return the identify
     */
    public Long getIdentify() {
        return this.identify;
    }

    /**
     * @param identify
     *            the identify to set
     */
    public void setIdentify(Long identify) {
        this.identify = identify;
    }

    /**
     * @return the allowDail
     */
    public Integer getAllowDail() {
        return this.allowDail;
    }

    /**
     * @param allowDail
     *            the allowDail to set
     */
    public void setAllowDail(Integer allowDail) {
        this.allowDail = allowDail;
    }

    /**
     * @return the registerTimeBegin
     */
    public Date getRegisterTimeBegin() {
        return this.registerTimeBegin;
    }

    /**
     * @param registerTimeBegin
     *            the registerTimeBegin to set
     */
    public void setRegisterTimeBegin(Date registerTimeBegin) {
        this.registerTimeBegin = registerTimeBegin;
    }

    /**
     * @return the registerTimeEnd
     */
    public Date getRegisterTimeEnd() {
        return this.registerTimeEnd;
    }

    /**
     * @param registerTimeEnd
     *            the registerTimeEnd to set
     */
    public void setRegisterTimeEnd(Date registerTimeEnd) {
        this.registerTimeEnd = registerTimeEnd;
    }

    /**
     * @return the lastTimeBegin
     */
    public Date getLastTimeBegin() {
        return this.lastTimeBegin;
    }

    /**
     * @param lastTimeBegin
     *            the lastTimeBegin to set
     */
    public void setLastTimeBegin(Date lastTimeBegin) {
        this.lastTimeBegin = lastTimeBegin;
    }

    /**
     * @return the lastTimeEnd
     */
    public Date getLastTimeEnd() {
        return this.lastTimeEnd;
    }

    /**
     * @param lastTimeEnd
     *            the lastTimeEnd to set
     */
    public void setLastTimeEnd(Date lastTimeEnd) {
        this.lastTimeEnd = lastTimeEnd;
    }

    /**
     * @return the attackTimeBegin
     */
    public Date getAttackTimeBegin() {
        return this.attackTimeBegin;
    }

    /**
     * @param attackTimeBegin
     *            the attackTimeBegin to set
     */
    public void setAttackTimeBegin(Date attackTimeBegin) {
        this.attackTimeBegin = attackTimeBegin;
    }

    /**
     * @return the attackTimeEnd
     */
    public Date getAttackTimeEnd() {
        return this.attackTimeEnd;
    }

    /**
     * @param attackTimeEnd
     *            the attackTimeEnd to set
     */
    public void setAttackTimeEnd(Date attackTimeEnd) {
        this.attackTimeEnd = attackTimeEnd;
    }

    /**
     * @return the reportTimeBegin
     */
    public Date getReportTimeBegin() {
        return this.reportTimeBegin;
    }

    /**
     * @param reportTimeBegin
     *            the reportTimeBegin to set
     */
    public void setReportTimeBegin(Date reportTimeBegin) {
        this.reportTimeBegin = reportTimeBegin;
    }

    /**
     * @return the reportTimeEnd
     */
    public Date getReportTimeEnd() {
        return this.reportTimeEnd;
    }

    /**
     * @param reportTimeEnd
     *            the reportTimeEnd to set
     */
    public void setReportTimeEnd(Date reportTimeEnd) {
        this.reportTimeEnd = reportTimeEnd;
    }

    /**
     * @return the unInstallTimeBegin
     */
    public Date getUnInstallTimeBegin() {
        return this.unInstallTimeBegin;
    }

    /**
     * @param unInstallTimeBegin
     *            the unInstallTimeBegin to set
     */
    public void setUnInstallTimeBegin(Date unInstallTimeBegin) {
        this.unInstallTimeBegin = unInstallTimeBegin;
    }

    /**
     * @return the unInstallTimeEnd
     */
    public Date getUnInstallTimeEnd() {
        return this.unInstallTimeEnd;
    }

    /**
     * @param unInstallTimeEnd
     *            the unInstallTimeEnd to set
     */
    public void setUnInstallTimeEnd(Date unInstallTimeEnd) {
        this.unInstallTimeEnd = unInstallTimeEnd;
    }

    /**
     * @return the idleTimeBegin
     */
    public Date getIdleTimeBegin() {
        return this.idleTimeBegin;
    }

    /**
     * @param idleTimeBegin
     *            the idleTimeBegin to set
     */
    public void setIdleTimeBegin(Date idleTimeBegin) {
        this.idleTimeBegin = idleTimeBegin;
    }

    /**
     * @return the idleTimeEnd
     */
    public Date getIdleTimeEnd() {
        return this.idleTimeEnd;
    }

    /**
     * @param idleTimeEnd
     *            the idleTimeEnd to set
     */
    public void setIdleTimeEnd(Date idleTimeEnd) {
        this.idleTimeEnd = idleTimeEnd;
    }

    /**
     * @return the bootTimeBegin
     */
    public Date getBootTimeBegin() {
        return this.bootTimeBegin;
    }

    /**
     * @param bootTimeBegin
     *            the bootTimeBegin to set
     */
    public void setBootTimeBegin(Date bootTimeBegin) {
        this.bootTimeBegin = bootTimeBegin;
    }

    /**
     * @return the bootTimeEnd
     */
    public Date getBootTimeEnd() {
        return this.bootTimeEnd;
    }

    /**
     * @param bootTimeEnd
     *            the bootTimeEnd to set
     */
    public void setBootTimeEnd(Date bootTimeEnd) {
        this.bootTimeEnd = bootTimeEnd;
    }

    /**
     * @return the protectEndTimeBegin
     */
    public Date getProtectEndTimeBegin() {
        return this.protectEndTimeBegin;
    }

    /**
     * @param protectEndTimeBegin
     *            the protectEndTimeBegin to set
     */
    public void setProtectEndTimeBegin(Date protectEndTimeBegin) {
        this.protectEndTimeBegin = protectEndTimeBegin;
    }

    /**
     * @return the protectEndTimeEnd
     */
    public Date getProtectEndTimeEnd() {
        return this.protectEndTimeEnd;
    }

    /**
     * @param protectEndTimeEnd
     *            the protectEndTimeEnd to set
     */
    public void setProtectEndTimeEnd(Date protectEndTimeEnd) {
        this.protectEndTimeEnd = protectEndTimeEnd;
    }

    /**
     * @return the lockedEndTimeBegin
     */
    public Date getLockedEndTimeBegin() {
        return this.lockedEndTimeBegin;
    }

    /**
     * @param lockedEndTimeBegin
     *            the lockedEndTimeBegin to set
     */
    public void setLockedEndTimeBegin(Date lockedEndTimeBegin) {
        this.lockedEndTimeBegin = lockedEndTimeBegin;
    }

    /**
     * @return the lockedEndTimeEnd
     */
    public Date getLockedEndTimeEnd() {
        return this.lockedEndTimeEnd;
    }

    /**
     * @param lockedEndTimeEnd
     *            the lockedEndTimeEnd to set
     */
    public void setLockedEndTimeEnd(Date lockedEndTimeEnd) {
        this.lockedEndTimeEnd = lockedEndTimeEnd;
    }

    /**
     * @return the onlineTime
     */
    public Long getOnlineTime() {
        return this.onlineTime;
    }

    /**
     * @param onlineTime
     *            the onlineTime to set
     */
    public void setOnlineTime(Long onlineTime) {
        this.onlineTime = onlineTime;
    }

    /**
     * @return the totalTime
     */
    public Long getTotalTime() {
        return this.totalTime;
    }

    /**
     * @param totalTime
     *            the totalTime to set
     */
    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * @return the dayTime
     */
    public Long getDayTime() {
        return this.dayTime;
    }

    /**
     * @param dayTime
     *            the dayTime to set
     */
    public void setDayTime(Long dayTime) {
        this.dayTime = dayTime;
    }

    /**
     * @return the runStatus
     */
    public Integer getRunStatus() {
        return this.runStatus;
    }

    /**
     * @param runStatus
     *            the runStatus to set
     */
    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    /**
     * @return the registered
     */
    public Integer getRegistered() {
        return this.registered;
    }

    /**
     * @param registered
     *            the registered to set
     */
    public void setRegistered(Integer registered) {
        this.registered = registered;
    }

    /**
     * @return the agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @param agentVersion
     *            the agentVersion to set
     */
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * @return the kvsCompany
     */
    public String getKvsCompany() {
        return this.kvsCompany;
    }

    /**
     * @param kvsCompany
     *            the kvsCompany to set
     */
    public void setKvsCompany(String kvsCompany) {
        this.kvsCompany = kvsCompany;
    }

    /**
     * @return the kvsVersion
     */
    public String getKvsVersion() {
        return this.kvsVersion;
    }

    /**
     * @param kvsVersion
     *            the kvsVersion to set
     */
    public void setKvsVersion(String kvsVersion) {
        this.kvsVersion = kvsVersion;
    }

    /**
     * @return the aclCtrl
     */
    public String getAclCtrl() {
        return this.aclCtrl;
    }

    /**
     * @param aclCtrl
     *            the aclCtrl to set
     */
    public void setAclCtrl(String aclCtrl) {
        this.aclCtrl = aclCtrl;
    }

    /**
     * @return the serviceNo
     */
    public String getServiceNo() {
        return this.serviceNo;
    }

    /**
     * @param serviceNo
     *            the serviceNo to set
     */
    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
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
     * @return the productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @param productId
     *            the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the countPatchLevel0
     */
    public Integer getCountPatchLevel0() {
        return this.countPatchLevel0;
    }

    /**
     * @param countPatchLevel0
     *            the countPatchLevel0 to set
     */
    public void setCountPatchLevel0(Integer countPatchLevel0) {
        this.countPatchLevel0 = countPatchLevel0;
    }

    /**
     * @return the countPatchLevel1
     */
    public Integer getCountPatchLevel1() {
        return this.countPatchLevel1;
    }

    /**
     * @param countPatchLevel1
     *            the countPatchLevel1 to set
     */
    public void setCountPatchLevel1(Integer countPatchLevel1) {
        this.countPatchLevel1 = countPatchLevel1;
    }

    /**
     * @return the countPatchLevel2
     */
    public Integer getCountPatchLevel2() {
        return this.countPatchLevel2;
    }

    /**
     * @param countPatchLevel2
     *            the countPatchLevel2 to set
     */
    public void setCountPatchLevel2(Integer countPatchLevel2) {
        this.countPatchLevel2 = countPatchLevel2;
    }

    /**
     * @return the countPatchLevel3
     */
    public Integer getCountPatchLevel3() {
        return this.countPatchLevel3;
    }

    /**
     * @param countPatchLevel3
     *            the countPatchLevel3 to set
     */
    public void setCountPatchLevel3(Integer countPatchLevel3) {
        this.countPatchLevel3 = countPatchLevel3;
    }

    /**
     * @return the countPatchLevel4
     */
    public Integer getCountPatchLevel4() {
        return this.countPatchLevel4;
    }

    /**
     * @param countPatchLevel4
     *            the countPatchLevel4 to set
     */
    public void setCountPatchLevel4(Integer countPatchLevel4) {
        this.countPatchLevel4 = countPatchLevel4;
    }

    /**
     * @return the validDay
     */
    public Integer getValidDay() {
        return this.validDay;
    }

    /**
     * @param validDay
     *            the validDay to set
     */
    public void setValidDay(Integer validDay) {
        this.validDay = validDay;
    }

    /**
     * @return the protect
     */
    public Integer getProtect() {
        return this.protect;
    }

    /**
     * @param protect
     *            the protect to set
     */
    public void setProtect(Integer protect) {
        this.protect = protect;
    }

    /**
     * @return the locked
     */
    public Integer getLocked() {
        return this.locked;
    }

    /**
     * @param locked
     *            the locked to set
     */
    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    /**
     * @return the forceout
     */
    public Integer getForceout() {
        return this.forceout;
    }

    /**
     * @param forceout
     *            the forceout to set
     */
    public void setForceout(Integer forceout) {
        this.forceout = forceout;
    }

    /**
     * @return the runLevel
     */
    public Integer getRunLevel() {
        return this.runLevel;
    }

    /**
     * @param runLevel
     *            the runLevel to set
     */
    public void setRunLevel(Integer runLevel) {
        this.runLevel = runLevel;
    }

    /**
     * @return the deviceStatus
     */
    public Integer getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * @param deviceStatus
     *            the deviceStatus to set
     */
    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    /**
     * @return the isLocal
     */
    public Integer getIsLocal() {
        return this.isLocal;
    }

    /**
     * @param isLocal
     *            the isLocal to set
     */
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * @return the reserved1
     */
    public Integer getReserved1() {
        return this.reserved1;
    }

    /**
     * @param reserved1
     *            the reserved1 to set
     */
    public void setReserved1(Integer reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * @return the reserved2
     */
    public Integer getReserved2() {
        return this.reserved2;
    }

    /**
     * @param reserved2
     *            the reserved2 to set
     */
    public void setReserved2(Integer reserved2) {
        this.reserved2 = reserved2;
    }

    /**
     * @return the reserved3
     */
    public Integer getReserved3() {
        return this.reserved3;
    }

    /**
     * @param reserved3
     *            the reserved3 to set
     */
    public void setReserved3(Integer reserved3) {
        this.reserved3 = reserved3;
    }

    /**
     * @return the reserved4
     */
    public Integer getReserved4() {
        return this.reserved4;
    }

    /**
     * @param reserved4
     *            the reserved4 to set
     */
    public void setReserved4(Integer reserved4) {
        this.reserved4 = reserved4;
    }

    /**
     * @return the reserved5
     */
    public Integer getReserved5() {
        return this.reserved5;
    }

    /**
     * @param reserved5
     *            the reserved5 to set
     */
    public void setReserved5(Integer reserved5) {
        this.reserved5 = reserved5;
    }

    /**
     * @return the reserved6
     */
    public Integer getReserved6() {
        return this.reserved6;
    }

    /**
     * @param reserved6
     *            the reserved6 to set
     */
    public void setReserved6(Integer reserved6) {
        this.reserved6 = reserved6;
    }

    /**
     * @return the reserved7
     */
    public Integer getReserved7() {
        return this.reserved7;
    }

    /**
     * @param reserved7
     *            the reserved7 to set
     */
    public void setReserved7(Integer reserved7) {
        this.reserved7 = reserved7;
    }

    /**
     * @return the reserved8
     */
    public Integer getReserved8() {
        return this.reserved8;
    }

    /**
     * @param reserved8
     *            the reserved8 to set
     */
    public void setReserved8(Integer reserved8) {
        this.reserved8 = reserved8;
    }

    /**
     * @return the migrate
     */
    public Integer getMigrate() {
        return this.migrate;
    }

    /**
     * @param migrate
     *            the migrate to set
     */
    public void setMigrate(Integer migrate) {
        this.migrate = migrate;
    }

    /**
     * @return the migrateRegIp
     */
    public String getMigrateRegIp() {
        return this.migrateRegIp;
    }

    /**
     * @param migrateRegIp
     *            the migrateRegIp to set
     */
    public void setMigrateRegIp(String migrateRegIp) {
        this.migrateRegIp = migrateRegIp;
    }

    /**
     * @return the migrateUnitName
     */
    public String getMigrateUnitName() {
        return this.migrateUnitName;
    }

    /**
     * @param migrateUnitName
     *            the migrateUnitName to set
     */
    public void setMigrateUnitName(String migrateUnitName) {
        this.migrateUnitName = migrateUnitName;
    }

    /**
     * @return the migrateTimeBegin
     */
    public Date getMigrateTimeBegin() {
        return this.migrateTimeBegin;
    }

    /**
     * @param migrateTimeBegin
     *            the migrateTimeBegin to set
     */
    public void setMigrateTimeBegin(Date migrateTimeBegin) {
        this.migrateTimeBegin = migrateTimeBegin;
    }

    /**
     * @return the migrateTimeEnd
     */
    public Date getMigrateTimeEnd() {
        return this.migrateTimeEnd;
    }

    /**
     * @param migrateTimeEnd
     *            the migrateTimeEnd to set
     */
    public void setMigrateTimeEnd(Date migrateTimeEnd) {
        this.migrateTimeEnd = migrateTimeEnd;
    }

    /**
     * @return the policemenKind
     */
    public String getPolicemenKind() {
        return this.policemenKind;
    }

    /**
     * @param policemenKind
     *            the policemenKind to set
     */
    public void setPolicemenKind(String policemenKind) {
        this.policemenKind = policemenKind;
    }

    /**
     * @return the intelAmtmode
     */
    public Integer getIntelAmtmode() {
        return this.intelAmtmode;
    }

    /**
     * @param intelAmtmode
     *            the intelAmtmode to set
     */
    public void setIntelAmtmode(Integer intelAmtmode) {
        this.intelAmtmode = intelAmtmode;
    }

    /**
     * @return the intelAmtip
     */
    public String getIntelAmtip() {
        return this.intelAmtip;
    }

    /**
     * @param intelAmtip
     *            the intelAmtip to set
     */
    public void setIntelAmtip(String intelAmtip) {
        this.intelAmtip = intelAmtip;
    }

    /**
     * @return the isIntelAmt
     */
    public Integer getIsIntelAmt() {
        return this.isIntelAmt;
    }

    /**
     * @param isIntelAmt
     *            the isIntelAmt to set
     */
    public void setIsIntelAmt(Integer isIntelAmt) {
        this.isIntelAmt = isIntelAmt;
    }

    /**
     * @return the amtuuid
     */
    public String getAmtuuid() {
        return this.amtuuid;
    }

    /**
     * @param amtuuid
     *            the amtuuid to set
     */
    public void setAmtuuid(String amtuuid) {
        this.amtuuid = amtuuid;
    }

    /**
     * @return the amtversion
     */
    public String getAmtversion() {
        return this.amtversion;
    }

    /**
     * @param amtversion
     *            the amtversion to set
     */
    public void setAmtversion(String amtversion) {
        this.amtversion = amtversion;
    }

    /**
     * @return the regip
     */
    public String getRegip() {
        return this.regip;
    }

    /**
     * @param regip
     *            the regip to set
     */
    public void setRegip(String regip) {
        this.regip = regip;
    }

    /**
     * @return the firwallStatus
     */
    public String getFirwallStatus() {
        return this.firwallStatus;
    }

    /**
     * @param firwallStatus
     *            the firwallStatus to set
     */
    public void setFirwallStatus(String firwallStatus) {
        this.firwallStatus = firwallStatus;
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
     * @return the computerManufacturer
     */
    public String getComputerManufacturer() {
        return this.computerManufacturer;
    }

    /**
     * @param computerManufacturer
     *            the computerManufacturer to set
     */
    public void setComputerManufacturer(String computerManufacturer) {
        this.computerManufacturer = computerManufacturer;
    }

    /**
     * @return the computerModel
     */
    public String getComputerModel() {
        return this.computerModel;
    }

    /**
     * @param computerModel
     *            the computerModel to set
     */
    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }

    /**
     * @return the externalDevice
     */
    public String getExternalDevice() {
        return this.externalDevice;
    }

    /**
     * @param externalDevice
     *            the externalDevice to set
     */
    public void setExternalDevice(String externalDevice) {
        this.externalDevice = externalDevice;
    }

    /**
     * @return the externalDeviceModel
     */
    public String getExternalDeviceModel() {
        return this.externalDeviceModel;
    }

    /**
     * @param externalDeviceModel
     *            the externalDeviceModel to set
     */
    public void setExternalDeviceModel(String externalDeviceModel) {
        this.externalDeviceModel = externalDeviceModel;
    }

    /**
     * @return the roomSerial
     */
    public String getRoomSerial() {
        return this.roomSerial;
    }

    /**
     * @param roomSerial
     *            the roomSerial to set
     */
    public void setRoomSerial(String roomSerial) {
        this.roomSerial = roomSerial;
    }

    /**
     * @return the deviceNumber
     */
    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    /**
     * @param deviceNumber
     *            the deviceNumber to set
     */
    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    /**
     * @return the deviceDesc
     */
    public String getDeviceDesc() {
        return this.deviceDesc;
    }

    /**
     * @param deviceDesc
     *            the deviceDesc to set
     */
    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc;
    }

    /**
     * @return the fwPolicy
     */
    public String getFwPolicy() {
        return this.fwPolicy;
    }

    /**
     * @param fwPolicy
     *            the fwPolicy to set
     */
    public void setFwPolicy(String fwPolicy) {
        this.fwPolicy = fwPolicy;
    }

    /**
     * @return the allOss
     */
    public String getAllOss() {
        return this.allOss;
    }

    /**
     * @param allOss
     *            the allOss to set
     */
    public void setAllOss(String allOss) {
        this.allOss = allOss;
    }

    /**
     * @return the setupTmosBegin
     */
    public Date getSetupTmosBegin() {
        return this.setupTmosBegin;
    }

    /**
     * @param setupTmosBegin
     *            the setupTmosBegin to set
     */
    public void setSetupTmosBegin(Date setupTmosBegin) {
        this.setupTmosBegin = setupTmosBegin;
    }

    /**
     * @return the setupTmosEnd
     */
    public Date getSetupTmosEnd() {
        return this.setupTmosEnd;
    }

    /**
     * @param setupTmosEnd
     *            the setupTmosEnd to set
     */
    public void setSetupTmosEnd(Date setupTmosEnd) {
        this.setupTmosEnd = setupTmosEnd;
    }

    /**
     * @return the osversion
     */
    public String getOsversion() {
        return this.osversion;
    }

    /**
     * @param osversion
     *            the osversion to set
     */
    public void setOsversion(String osversion) {
        this.osversion = osversion;
    }

    /**
     * @return the pki
     */
    public String getPki() {
        return this.pki;
    }

    /**
     * @param pki
     *            the pki to set
     */
    public void setPki(String pki) {
        this.pki = pki;
    }

    /**
     * @return the healthScore
     */
    public Integer getHealthScore() {
        return this.healthScore;
    }

    /**
     * @param healthScore
     *            the healthScore to set
     */
    public void setHealthScore(Integer healthScore) {
        this.healthScore = healthScore;
    }

    /**
     * @return the healthTimeBegin
     */
    public Date getHealthTimeBegin() {
        return this.healthTimeBegin;
    }

    /**
     * @param healthTimeBegin
     *            the healthTimeBegin to set
     */
    public void setHealthTimeBegin(Date healthTimeBegin) {
        this.healthTimeBegin = healthTimeBegin;
    }

    /**
     * @return the healthTimeEnd
     */
    public Date getHealthTimeEnd() {
        return this.healthTimeEnd;
    }

    /**
     * @param healthTimeEnd
     *            the healthTimeEnd to set
     */
    public void setHealthTimeEnd(Date healthTimeEnd) {
        this.healthTimeEnd = healthTimeEnd;
    }

    /**
     * @return the synStatus
     */
    public Integer getSynStatus() {
        return this.synStatus;
    }

    /**
     * @param synStatus
     *            the synStatus to set
     */
    public void setSynStatus(Integer synStatus) {
        this.synStatus = synStatus;
    }

    /**
     * @return the activeNetCard
     */
    public String getActiveNetCard() {
        return this.activeNetCard;
    }

    /**
     * @param activeNetCard
     *            the activeNetCard to set
     */
    public void setActiveNetCard(String activeNetCard) {
        this.activeNetCard = activeNetCard;
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
     * @return the actUser
     */
    public String getActUser() {
        return this.actUser;
    }

    /**
     * @param actUser
     *            the actUser to set
     */
    public void setActUser(String actUser) {
        this.actUser = actUser;
    }

    /**
     * @return the loginCount
     */
    public Integer getLoginCount() {
        return this.loginCount;
    }

    /**
     * @param loginCount
     *            the loginCount to set
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * @return the tioStatus
     */
    public Integer getTioStatus() {
        return this.tioStatus;
    }

    /**
     * @param tioStatus
     *            the tioStatus to set
     */
    public void setTioStatus(Integer tioStatus) {
        this.tioStatus = tioStatus;
    }

    /**
     * @return the separateFlag
     */
    public Integer getSeparateFlag() {
        return this.separateFlag;
    }

    /**
     * @param separateFlag
     *            the separateFlag to set
     */
    public void setSeparateFlag(Integer separateFlag) {
        this.separateFlag = separateFlag;
    }

    /**
     * @return the manualTag
     */
    public Integer getManualTag() {
        return this.manualTag;
    }

    /**
     * @param manualTag
     *            the manualTag to set
     */
    public void setManualTag(Integer manualTag) {
        this.manualTag = manualTag;
    }

    /**
     * @return the regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @param regionCode
     *            the regionCode to set
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
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

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

}
