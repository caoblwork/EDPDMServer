package com.vrv.netmgr.entity;

import java.util.Date;

import com.vrv.framework.dao.domain.BaseEntity;

/**
 * 策略相关对象对应数据库表<Policy_List>
 *
 * @author 曹保利
 *
 */
public class Policy extends BaseEntity {

    /** 序列化ID */
    private static final long serialVersionUID = -3513550145612293520L;

    /** 策略ID */
    private Integer policyId = null;

    /** 三权分立下的策略ID 对应 Policy_List_NOPASS表中 Policy_ID */
    private Integer fpolicyId = null;

    /** 策略名称 */
    private String policyName = null;

    /** 策略类型 */
    private String policyFunc = null;

    /** 策略类型ID */
    private Integer policyFuncNum = null;

    /** 策略内容 */
    private String policyContent = null;

    /** 策略对象 */
    private String policyObject = null;

    /** 策略创建时间 */
    private Date policyCreate = null;

    /** 策略创建人及IP地址 */
    private String policyCreateUser = null;

    /** 策略修改时间 */
    private Date policyModify = null;

    /** 策略内容修改时间 */
    private Date policyModifyContent = null;

    /** 策略修改人及IP地址 */
    private String policyModifyUser = null;

    /** 操作系统 */
    private String ostype = null;

    /** 标志开始: 1表示启用; 0标识禁用 */
    private Integer policyStart = null;

    /** 说明 */
    private String remark = null;

    /** 策略的CRC值 */
    private Long policyCrc = null;

    /** 策略内容的CRC值 */
    private Long policyCrccontent = null;

    /** 策略对象的CRC值 */
    private Long policyCrcobject = null;

    /**
     * <ul>
     * 策略的审核状态:
     * <li>0:标识审核通过</li>
     * <li>1:标识待审核</li>
     * <li>2:标识审核未通过</li>
     * </ul>
     */
    private Integer policyChanged = null;

    /**
     * <ul>
     * <li>reserved3 & 512 ：强制策略</li>
     * <li>other 普通策略</li>
     * </ul>
     */
    private Integer reserved1 = null;

    /**
     * <ul>
     * 级联模式
     * <li>UpPolicyID>0 上级</li>
     * <li>UpPolicyID<=0 本级</li>
     * </ul>
     */
    private Integer reserved2 = null;

    /**
     * <ul>
     * <li>reserved3 & 8 ：强制策略</li>
     * <li>reserved3 & 16 ：样板模版</li>
     * <li>reserved3 & 32：自定义模版</li>
     * <li>other 普通策略</li>
     * </ul>
     */
    private Integer reserved3 = null;

    /** reserved4 */
    private Long reserved4 = null;

    /** reserved5 */
    private String reserved5 = null;

    /** reserved6 */
    private String reserved6 = null;

    /** 修改的权限 */
    private String reserved7 = null;

    /** policyExecuteLevel */
    private Integer policyExecuteLevel = null;

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
     * @return the fpolicyId
     */
    public Integer getFpolicyId() {
        return this.fpolicyId;
    }

    /**
     * @param fpolicyId
     *            the fpolicyId to set
     */
    public void setFpolicyId(Integer fpolicyId) {
        this.fpolicyId = fpolicyId;
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
     * @return the policyFunc
     */
    public String getPolicyFunc() {
        return this.policyFunc;
    }

    /**
     * @param policyFunc
     *            the policyFunc to set
     */
    public void setPolicyFunc(String policyFunc) {
        this.policyFunc = policyFunc;
    }

    /**
     * @return the policyFuncNum
     */
    public Integer getPolicyFuncNum() {
        return this.policyFuncNum;
    }

    /**
     * @param policyFuncNum
     *            the policyFuncNum to set
     */
    public void setPolicyFuncNum(Integer policyFuncNum) {
        this.policyFuncNum = policyFuncNum;
    }

    /**
     * @return the policyContent
     */
    public String getPolicyContent() {
        return this.policyContent;
    }

    /**
     * @param policyContent
     *            the policyContent to set
     */
    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
    }

    /**
     * @return the policyObject
     */
    public String getPolicyObject() {
        return this.policyObject;
    }

    /**
     * @param policyObject
     *            the policyObject to set
     */
    public void setPolicyObject(String policyObject) {
        this.policyObject = policyObject;
    }

    /**
     * @return the policyCreate
     */
    public Date getPolicyCreate() {
        return this.policyCreate;
    }

    /**
     * @param policyCreate
     *            the policyCreate to set
     */
    public void setPolicyCreate(Date policyCreate) {
        this.policyCreate = policyCreate;
    }

    /**
     * @return the policyCreateUser
     */
    public String getPolicyCreateUser() {
        return this.policyCreateUser;
    }

    /**
     * @param policyCreateUser
     *            the policyCreateUser to set
     */
    public void setPolicyCreateUser(String policyCreateUser) {
        this.policyCreateUser = policyCreateUser;
    }

    /**
     * @return the policyModify
     */
    public Date getPolicyModify() {
        return this.policyModify;
    }

    /**
     * @param policyModify
     *            the policyModify to set
     */
    public void setPolicyModify(Date policyModify) {
        this.policyModify = policyModify;
    }

    /**
     * @return the policyModifyContent
     */
    public Date getPolicyModifyContent() {
        return this.policyModifyContent;
    }

    /**
     * @param policyModifyContent
     *            the policyModifyContent to set
     */
    public void setPolicyModifyContent(Date policyModifyContent) {
        this.policyModifyContent = policyModifyContent;
    }

    /**
     * @return the policyModifyUser
     */
    public String getPolicyModifyUser() {
        return this.policyModifyUser;
    }

    /**
     * @param policyModifyUser
     *            the policyModifyUser to set
     */
    public void setPolicyModifyUser(String policyModifyUser) {
        this.policyModifyUser = policyModifyUser;
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
     * @return the policyStart
     */
    public Integer getPolicyStart() {
        return this.policyStart;
    }

    /**
     * @param policyStart
     *            the policyStart to set
     */
    public void setPolicyStart(Integer policyStart) {
        this.policyStart = policyStart;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @param remark
     *            the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the policyCrc
     */
    public Long getPolicyCrc() {
        return this.policyCrc;
    }

    /**
     * @param policyCrc
     *            the policyCrc to set
     */
    public void setPolicyCrc(Long policyCrc) {
        this.policyCrc = policyCrc;
    }

    /**
     * @return the policyCrccontent
     */
    public Long getPolicyCrccontent() {
        return this.policyCrccontent;
    }

    /**
     * @param policyCrccontent
     *            the policyCrccontent to set
     */
    public void setPolicyCrccontent(Long policyCrccontent) {
        this.policyCrccontent = policyCrccontent;
    }

    /**
     * @return the policyCrcobject
     */
    public Long getPolicyCrcobject() {
        return this.policyCrcobject;
    }

    /**
     * @param policyCrcobject
     *            the policyCrcobject to set
     */
    public void setPolicyCrcobject(Long policyCrcobject) {
        this.policyCrcobject = policyCrcobject;
    }

    /**
     * @return the policyChanged
     */
    public Integer getPolicyChanged() {
        return this.policyChanged;
    }

    /**
     * @param policyChanged
     *            the policyChanged to set
     */
    public void setPolicyChanged(Integer policyChanged) {
        this.policyChanged = policyChanged;
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
    public Long getReserved4() {
        return this.reserved4;
    }

    /**
     * @param reserved4
     *            the reserved4 to set
     */
    public void setReserved4(Long reserved4) {
        this.reserved4 = reserved4;
    }

    /**
     * @return the reserved5
     */
    public String getReserved5() {
        return this.reserved5;
    }

    /**
     * @param reserved5
     *            the reserved5 to set
     */
    public void setReserved5(String reserved5) {
        this.reserved5 = reserved5;
    }

    /**
     * @return the reserved6
     */
    public String getReserved6() {
        return this.reserved6;
    }

    /**
     * @param reserved6
     *            the reserved6 to set
     */
    public void setReserved6(String reserved6) {
        this.reserved6 = reserved6;
    }

    /**
     * @return the reserved7
     */
    public String getReserved7() {
        return this.reserved7;
    }

    /**
     * @param reserved7
     *            the reserved7 to set
     */
    public void setReserved7(String reserved7) {
        this.reserved7 = reserved7;
    }

    /**
     * @return the policyExecuteLevel
     */
    public Integer getPolicyExecuteLevel() {
        return this.policyExecuteLevel;
    }

    /**
     * @param policyExecuteLevel
     *            the policyExecuteLevel to set
     */
    public void setPolicyExecuteLevel(Integer policyExecuteLevel) {
        this.policyExecuteLevel = policyExecuteLevel;
    }
}
