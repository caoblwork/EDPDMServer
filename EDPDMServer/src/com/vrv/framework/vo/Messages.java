package com.vrv.framework.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 逻辑消息集合
 * 
 * @author 曹保利
 * 
 */
public class Messages implements Serializable {

	private static final long serialVersionUID = -7410826431026041043L;

	protected List<String> list = new ArrayList<String>();

	public Messages() {
		super();
	}

	public Messages(String msg) {
		super();
		list.add(msg);
	}

	public void add(String msg) {
		this.list.add(msg);
	}

	public List<String> getMessages() {
		return this.list;
	}

	public void clear() {
		this.list.clear();
	}

	public boolean isEmpty() {
		return (list.isEmpty());
	}

}
