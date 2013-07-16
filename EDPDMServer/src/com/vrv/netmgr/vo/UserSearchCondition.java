package com.vrv.netmgr.vo;

import com.vrv.framework.vo.SearchCondition;

public class UserSearchCondition extends SearchCondition {

	/** 序列化ID */
	private static final long serialVersionUID = 3110364984090167369L;

	/** 创建该用户的管理员ID */
	private String parentId;

	/** 管理员名称 */
	private String name;

	/** 管理员密码 */
	private String passWord;

	/** 管理员类型 */
	private String type;

	/** 管理员用户菜单 */
	private String menuType;

	/** 仅允许登陆系统的IP列表(为空则允许所有IP访问) */
	private String visitAllowIPS;

	/** 可用USB标签 */
	private String usbKey;

	/** 备注你懂的 */
	private String description;

	/** USB授权个数 */
	private int usbCount;

	/** USB剩余授权个数 */
	private int usbCurcnt;

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getVisitAllowIPS() {
		return visitAllowIPS;
	}

	public void setVisitAllowIPS(String visitAllowIPS) {
		this.visitAllowIPS = visitAllowIPS;
	}

	public String getUsbKey() {
		return usbKey;
	}

	public void setUsbKey(String usbKey) {
		this.usbKey = usbKey;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUsbCount() {
		return usbCount;
	}

	public void setUsbCount(int usbCount) {
		this.usbCount = usbCount;
	}

	public int getUsbCurcnt() {
		return usbCurcnt;
	}

	public void setUsbCurcnt(int usbCurcnt) {
		this.usbCurcnt = usbCurcnt;
	}

}
