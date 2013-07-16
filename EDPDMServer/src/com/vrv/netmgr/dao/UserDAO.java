package com.vrv.netmgr.dao;

import java.util.List;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.netmgr.entity.User;

public interface UserDAO extends BaseDAO<User, String> {
	/**
	 * 根据用户登陆名称获取用户
	 * 
	 * @param name 用户的loginId
	 * @return
	 */
	List<User> findUserByLoginId(String name);

}
