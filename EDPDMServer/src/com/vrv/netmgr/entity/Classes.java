package com.vrv.netmgr.entity;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * 区域划分
 *
 * @author 曹保利
 *
 */
public class Classes extends BaseEntity {
    /** 序列化ID */
    private static final long serialVersionUID = 4226225152341889138L;
    /** 区域ID */
    private Integer classId = null;
    /** 上级区域 */
    private Integer upId = null;
    /** 区域编码 */
    private String classCode = null;
    /** 区域名称 */
    private String className = null;
    /** dummyIp */
    private String dummyIp = null;
    /** hostUrl1 */
    private String hostUrl1 = null;
    /** hostUrl2 */
    private String hostUrl2 = null;
    /** regLicenceString */
    private String regLicenceString = null;
    /** regLicenceNum */
    private Integer regLicenceNum = null;
    /** preventType */
    private Integer preventType = null;
    /** scanPreType */
    private Integer scanPreType = null;
    /** usbKey */
    private String usbKey = null;
    /** description1 */
    private String description1 = null;
    /** description2 */
    private String description2 = null;
    /** description3 */
    private String description3 = null;
    /** flag */
    private Integer flag = null;
    /** classIdlevel */
    private String classIdlevel = null;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getUpId() {
        return upId;
    }

    public void setUpId(Integer upId) {
        this.upId = upId;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDummyIp() {
        return dummyIp;
    }

    public void setDummyIp(String dummyIp) {
        this.dummyIp = dummyIp;
    }

    public String getHostUrl1() {
        return hostUrl1;
    }

    public void setHostUrl1(String hostUrl1) {
        this.hostUrl1 = hostUrl1;
    }

    public String getHostUrl2() {
        return hostUrl2;
    }

    public void setHostUrl2(String hostUrl2) {
        this.hostUrl2 = hostUrl2;
    }

    public String getRegLicenceString() {
        return regLicenceString;
    }

    public void setRegLicenceString(String regLicenceString) {
        this.regLicenceString = regLicenceString;
    }

    public Integer getRegLicenceNum() {
        return regLicenceNum;
    }

    public void setRegLicenceNum(Integer regLicenceNum) {
        this.regLicenceNum = regLicenceNum;
    }

    public Integer getPreventType() {
        return preventType;
    }

    public void setPreventType(Integer preventType) {
        this.preventType = preventType;
    }

    public Integer getScanPreType() {
        return scanPreType;
    }

    public void setScanPreType(Integer scanPreType) {
        this.scanPreType = scanPreType;
    }

    public String getUsbKey() {
        return usbKey;
    }

    public void setUsbKey(String usbKey) {
        this.usbKey = usbKey;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getClassIdlevel() {
        return classIdlevel;
    }

    public void setClassIdlevel(String classIdlevel) {
        this.classIdlevel = classIdlevel;
    }

}
