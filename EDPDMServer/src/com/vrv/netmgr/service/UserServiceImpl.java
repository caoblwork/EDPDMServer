package com.vrv.netmgr.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vrv.common.utils.MD5;
import com.vrv.common.utils.StringUtil;
import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.framework.service.LogicProcessResult;
import com.vrv.netmgr.dao.UserDAO;
import com.vrv.netmgr.entity.User;
import com.vrv.netmgr.vo.UserSearchCondition;

/**
 * User service实现类
 * 
 * @author 曹保利
 * @version 1.0
 * 
 */
@Service(value = "userService")
public class UserServiceImpl extends EntityServiceImpl<User> implements UserService {

	@Autowired
	private UserDAO userDao;

	@Autowired
	@Qualifier("userDao")
	public void setUserDao(BaseDAO<User, Serializable> userDao) {
		super.dao = userDao;
	}

	@Override
	public User getUserByLoginId(UserSearchCondition userSearchCondition) {
		String passWord = userSearchCondition.getPassWord();
		if (!StringUtil.isValidString(passWord)) {
			return null;
		}

		List<User> users = userDao.findUserByLoginId(userSearchCondition.getName());
		for (User user : users) {
			if (MD5.GetMD5Code(passWord).toUpperCase().equals(user.getPassWord())) {
				return user;
			}
		}
		return null;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public LogicProcessResult save(User valueObject) {
		// 处理加密
		String passWord = valueObject.getPassWord();
		passWord = MD5.GetMD5Code(passWord).toUpperCase();
		valueObject.setPassWord(passWord);
		// 继续父类的操作
		return super.save(valueObject);
	}

}
