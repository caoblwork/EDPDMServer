package com.vrv.framework.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 带有审计信息的表现层对象
 * 
 * @author 曹保利
 * 
 */
public class BaseVo implements Serializable {
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = -2004194667555333107L;
	/**
	 * 标识
	 */
	private String id = null;
	/**
	 * 版本号
	 */
	private Integer version = null;
	/**
	 * 标识数组
	 */
	private String ids[];
	/**
	 * 创建时间
	 */
	protected String createBy;

	/**
	 * 创建时间
	 */
	protected Date createDate;

	/**
	 * 修改者ID
	 */
	protected String updateBy;

	/**
	 * 修改时间
	 */
	protected Date updateDate;

	/**
	 * 记录状态
	 */
	protected String status;

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param ids
	 *            the ids to set
	 */
	public void setIds(String ids[]) {
		this.ids = ids;
	}

	/**
	 * @return the ids
	 */
	public String[] getIds() {
		return ids;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
