/**
 *
 */
package com.vrv.netmgr.vo;

import com.vrv.framework.vo.BaseVo;

/**
 * @author 曹保利
 *
 */
public class IpInfoVo extends BaseVo {

    /** serialUID */
    private static final long serialVersionUID = 2330067092712204288L;

    /** 来自区域划分信息-区域ID */
    private Integer classId = null;

    /** 来自区域划分信息-区域名称 */
    private String className = null;

    /** 设备IP地址 */
    private String ipaddres = null;

    /** 是否注册 1--注册 0--未注册 */
    private Integer registered = null;

    /** ip换算成数字(用于比较数字大小) **/
    private String numIpaddress = null;

    private Long ipAccount = 0L;

    /** 该ip是否被注册过（ip>0表示注册过） */
    private Integer ipRegistered = 0;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getIpaddres() {
        return ipaddres;
    }

    public void setIpaddres(String ipaddres) {
        this.ipaddres = ipaddres;
    }

    public Integer getRegistered() {
        return registered;
    }

    public void setRegistered(Integer registered) {
        this.registered = registered;
    }

    public String getNumIpaddress() {
        return numIpaddress;
    }

    public void setNumIpaddress(String numIpaddress) {
        this.numIpaddress = numIpaddress;
    }

    public Long getIpAccount() {
        return ipAccount;
    }

    public void setIpAccount(Long ipAccount) {
        this.ipAccount = ipAccount;
    }

    public Integer getIpRegistered() {
        return ipRegistered;
    }

    public void setIpRegistered(Integer ipRegistered) {
        this.ipRegistered = ipRegistered;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
