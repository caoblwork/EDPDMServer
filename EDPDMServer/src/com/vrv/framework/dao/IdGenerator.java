package com.vrv.framework.dao;

import java.sql.Date;
import java.util.UUID;

import com.vrv.common.utils.DateUtil;

public class IdGenerator {

	static long current = System.currentTimeMillis();

	/**
	 * 使用UUID获取唯一的字符串
	 * 
	 * @return uniqueID
	 */
	public static synchronized String generateUUID() {
		String id = UUID.randomUUID().toString();
		id = id.replaceAll("-", "");
		return id;
	}

	/**
	 * 使用系统时间获取唯一的字符串
	 * 
	 * @return uniqueID
	 */
	public static synchronized String generateId() {
		return DateUtil.convertDate2String(new Date(current++), "yyyyMMddHHmmssSSS");
	}

	/**
	 * 使用系统时间获取唯一的字符串
	 * 
	 * @return uniqueID
	 */
	public static synchronized Long generateLongId() {
		return Long.valueOf(current);
	}
}