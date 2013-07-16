package com.vrv.netmgr.service;

import com.vrv.framework.service.EntityService;
import com.vrv.netmgr.entity.User;
import com.vrv.netmgr.vo.UserSearchCondition;

/**
 * User service接口
 * 
 * @author 曹保利
 * @version 1.0
 */
public interface UserService extends EntityService<User> {
	/**
	 * 用户登录
	 * 
	 * @param userSearchCondition
	 * @return
	 */
	User getUserByLoginId(UserSearchCondition userSearchCondition);
}
