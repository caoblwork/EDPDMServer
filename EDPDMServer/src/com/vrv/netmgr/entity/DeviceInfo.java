package com.vrv.netmgr.entity;

import java.util.Date;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * 设备信息
 *
 * @author 曹保利
 *
 */
public class DeviceInfo extends BaseEntity {

    /** 序列化ID */
    private static final long serialVersionUID = -1278226892325802134L;

    /** 设备ID */
    private Long deviceId = null;

    /** 来自区域划分信息-区域ID */
    private Integer classId = null;

    /** 来自区域划分信息-父区域ID-upId */
    private Integer parentId = null;

    /** 来自区域划分信息-区域名称 */
    private String className = null;

    /** 来自区域管理器-区域管理器ID */
    private Integer regId = null;

    /** 来自区域管理器-区域管理器名称 */
    private String regName = null;

    /** 来自区域管理器-区域管理器注册IP */
    private String regIp = null;

    /** 设备所属单位名称 */
    private String deptName = null;

    /** 设备所属部门名称 */
    private String officeName = null;

    /** 备所属科室名称 */
    private String subOffice = null;

    /** 使用人 */
    private String userName = null;

    /** 联系电话 */
    private String tel = null;

    /** email */
    private String email = null;

    /** 数字IP地址 */
    private Long numIpaddress = null;

    /** 设备IP地址 */
    private String ipaddres = null;

    /** 通信IP */
    private String routeIpaddress = null;

    /** 设备MAC地址 */
    private String macAddress = null;

    /** 设备名称 */
    private String deviceName = null;

    /** 别名 */
    private String aliasName = null;

    /** 所在交换机IP */
    private String switchIp = null;

    /** 所在交换机端口 */
    private String switchPort = null;

    /** 所在交换机名称 */
    private String switchName = null;

    /** 设备描述 */
    private String deviceDesc = null;

    /** 操作系统登陆名称 */
    private String logonUserName = null;

    /** 登陆域名称 */
    private String domainName = null;

    /** 是否注册 1--注册 0--未注册 */
    private Integer registered = null;

    /** 运行状态 1--开机 0--关机 */
    private Integer runStatus = null;

    /** 是否锁定 1--锁定 0--不锁定 */
    private Integer locked = null;

    /** 是否保护 1--保护 0--不保护 */
    private Integer protect = null;

    /** 是否阻断 1--阻断 0--不阻断 */
    private Integer forceout = null;

    /** 安全级别 */
    private Integer runLevel = null;

    /** 杀毒软件厂商 */
    private String kvsCompany = null;

    /** 操作系统类型 */
    private String ostype = null;

    /** 计算机所在地 */
    private String roomNumber = null;

    /** 资产号 */
    private String deviceCode = null;

    /** 备注（数据库设计书上是这么说的不怪我） */
    private String floorNumber = null;

    /** 扩充多选一（数据库设计书上是这么说的不怪我） */
    private String policemenKind = null;

    /** 硬盘序列号 */
    private String diskSerial = null;

    /**
     * <ul>
     * 漫游状态
     *
     * <li>0--无漫游</li>
     * <li>1--漫游进来</li>
     * <li>2--漫游出去</li>
     * <li>3--再次漫游</li>
     * <li>4--漫游回去</li>
     * <li>5--漫游出去（离开管理范围，但未被管理器接收）</li>
     * </ul>
     **/
    private Integer migrate = null;

    /** CPU主频 */
    private Integer cpu = null;

    /** 内存大小 */
    private Integer memory = null;

    /** 硬盘空间 */
    private Integer diskSize = null;

    /** 识别标识 */
    private Long identify = null;

    /** 是否运行拨号上网 */
    private Integer allowDail = null;

    /** 注册时间（未注册设备为首次发现时间） */
    private Date registerTime = null;

    /** 最后使用时间 */
    private Date lastTime = null;

    /** 客户端版本号 */
    private String agentVersion = null;

    /** 预留字段 */
    private Integer reserved1 = null;

    /** 预留字段 */
    private Integer reserved2 = null;

    /** 预留字段 */
    private Integer reserved3 = null;

    /** 设备状态 1--繁忙 0--空闲 */
    private Integer deviceStatus = null;

    /** 描述你懂的 */
    private String description = null;

    /** 操作系统产品号 */
    private String productId = null;

    /** 杀毒软件版本 */
    private String kvsVersion = null;

    /** 卸载时间 */
    private Date unInstallTime = null;

    /** Service pack号 */
    private String spNumber = null;

    /** ie版本 */
    private String ieversion = null;

    /** cpuType */
    private String cpuType = null;

    /** 是否是IntelAMT设备 支持英特尔芯片的Vpro技术 1--是 0--否 */
    private Integer isIntelAmt = null;

    /** Intel vPro设备工作模式 */
    private Integer intelAmtmode = null;

    /** Intel vPro设备IP地址 */
    private String intelAmtip = null;

    /** 是否属于本地管理器管理 1--是 0--否 */
    private Integer isLocal = null;

    /** 授权码（控制授权用，注册时候输入的） */
    private String aclCtrl = null;

    /** 最后阻断时间 */
    private Date attackTime = null;

    /** 锁定结束时间 */
    private Date lockedEndTime = null;

    /** 保护结束时间 */
    private Date protectEndTime = null;

    /** 当前操作系统安装时间 */
    private Date setupTmos = null;

    /** 原管理器IP */
    private String migrateRegIp = null;

    /** 原单位名称 */
    private String migrateUnitName = null;

    /** 漫游时间 */
    private Date migrateTime = null;

    /** 空闲时间 */
    private Date idleTime = null;

    /** 端口描述 */
    private String portDescr = null;

    /** 操作系统语言 */
    private String osLanguage = null;

    /** 设备唯一ID */
    private Long devOnlyId = null;

    /** 最后触发时间 */
    private Date reportTime = null;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getSubOffice() {
        return subOffice;
    }

    public void setSubOffice(String subOffice) {
        this.subOffice = subOffice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getNumIpaddress() {
        return numIpaddress;
    }

    public void setNumIpaddress(Long numIpaddress) {
        this.numIpaddress = numIpaddress;
    }

    public String getIpaddres() {
        return ipaddres;
    }

    public void setIpaddres(String ipaddres) {
        this.ipaddres = ipaddres;
    }

    public String getRouteIpaddress() {
        return routeIpaddress;
    }

    public void setRouteIpaddress(String routeIpaddress) {
        this.routeIpaddress = routeIpaddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getSwitchIp() {
        return switchIp;
    }

    public void setSwitchIp(String switchIp) {
        this.switchIp = switchIp;
    }

    public String getSwitchPort() {
        return switchPort;
    }

    public void setSwitchPort(String switchPort) {
        this.switchPort = switchPort;
    }

    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public String getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc;
    }

    public String getLogonUserName() {
        return logonUserName;
    }

    public void setLogonUserName(String logonUserName) {
        this.logonUserName = logonUserName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public Integer getRegistered() {
        return registered;
    }

    public void setRegistered(Integer registered) {
        this.registered = registered;
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Integer getProtect() {
        return protect;
    }

    public void setProtect(Integer protect) {
        this.protect = protect;
    }

    public Integer getForceout() {
        return forceout;
    }

    public void setForceout(Integer forceout) {
        this.forceout = forceout;
    }

    public Integer getRunLevel() {
        return runLevel;
    }

    public void setRunLevel(Integer runLevel) {
        this.runLevel = runLevel;
    }

    public String getKvsCompany() {
        return kvsCompany;
    }

    public void setKvsCompany(String kvsCompany) {
        this.kvsCompany = kvsCompany;
    }

    public String getOstype() {
        return ostype;
    }

    public void setOstype(String ostype) {
        this.ostype = ostype;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getPolicemenKind() {
        return policemenKind;
    }

    public void setPolicemenKind(String policemenKind) {
        this.policemenKind = policemenKind;
    }

    public String getDiskSerial() {
        return diskSerial;
    }

    public void setDiskSerial(String diskSerial) {
        this.diskSerial = diskSerial;
    }

    public Integer getMigrate() {
        return migrate;
    }

    public void setMigrate(Integer migrate) {
        this.migrate = migrate;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public Long getIdentify() {
        return identify;
    }

    public void setIdentify(Long identify) {
        this.identify = identify;
    }

    public Integer getAllowDail() {
        return allowDail;
    }

    public void setAllowDail(Integer allowDail) {
        this.allowDail = allowDail;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Integer getReserved1() {
        return reserved1;
    }

    public void setReserved1(Integer reserved1) {
        this.reserved1 = reserved1;
    }

    public Integer getReserved2() {
        return reserved2;
    }

    public void setReserved2(Integer reserved2) {
        this.reserved2 = reserved2;
    }

    public Integer getReserved3() {
        return reserved3;
    }

    public void setReserved3(Integer reserved3) {
        this.reserved3 = reserved3;
    }

    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getKvsVersion() {
        return kvsVersion;
    }

    public void setKvsVersion(String kvsVersion) {
        this.kvsVersion = kvsVersion;
    }

    public Date getUnInstallTime() {
        return unInstallTime;
    }

    public void setUnInstallTime(Date unInstallTime) {
        this.unInstallTime = unInstallTime;
    }

    public String getSpNumber() {
        return spNumber;
    }

    public void setSpNumber(String spNumber) {
        this.spNumber = spNumber;
    }

    public String getIeversion() {
        return ieversion;
    }

    public void setIeversion(String ieversion) {
        this.ieversion = ieversion;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public Integer getIsIntelAmt() {
        return isIntelAmt;
    }

    public void setIsIntelAmt(Integer isIntelAmt) {
        this.isIntelAmt = isIntelAmt;
    }

    public Integer getIntelAmtmode() {
        return intelAmtmode;
    }

    public void setIntelAmtmode(Integer intelAmtmode) {
        this.intelAmtmode = intelAmtmode;
    }

    public String getIntelAmtip() {
        return intelAmtip;
    }

    public void setIntelAmtip(String intelAmtip) {
        this.intelAmtip = intelAmtip;
    }

    public Integer getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    public String getAclCtrl() {
        return aclCtrl;
    }

    public void setAclCtrl(String aclCtrl) {
        this.aclCtrl = aclCtrl;
    }

    public Date getAttackTime() {
        return attackTime;
    }

    public void setAttackTime(Date attackTime) {
        this.attackTime = attackTime;
    }

    public Date getLockedEndTime() {
        return lockedEndTime;
    }

    public void setLockedEndTime(Date lockedEndTime) {
        this.lockedEndTime = lockedEndTime;
    }

    public Date getProtectEndTime() {
        return protectEndTime;
    }

    public void setProtectEndTime(Date protectEndTime) {
        this.protectEndTime = protectEndTime;
    }

    public Date getSetupTmos() {
        return setupTmos;
    }

    public void setSetupTmos(Date setupTmos) {
        this.setupTmos = setupTmos;
    }

    public String getMigrateRegIp() {
        return migrateRegIp;
    }

    public void setMigrateRegIp(String migrateRegIp) {
        this.migrateRegIp = migrateRegIp;
    }

    public String getMigrateUnitName() {
        return migrateUnitName;
    }

    public void setMigrateUnitName(String migrateUnitName) {
        this.migrateUnitName = migrateUnitName;
    }

    public Date getMigrateTime() {
        return migrateTime;
    }

    public void setMigrateTime(Date migrateTime) {
        this.migrateTime = migrateTime;
    }

    public Date getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(Date idleTime) {
        this.idleTime = idleTime;
    }

    public String getPortDescr() {
        return portDescr;
    }

    public void setPortDescr(String portDescr) {
        this.portDescr = portDescr;
    }

    public String getOsLanguage() {
        return osLanguage;
    }

    public void setOsLanguage(String osLanguage) {
        this.osLanguage = osLanguage;
    }

    public Long getDevOnlyId() {
        return devOnlyId;
    }

    public void setDevOnlyId(Long devOnlyId) {
        this.devOnlyId = devOnlyId;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

}
