package com.vrv.netmgr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vrv.netmgr.dao.UserDAO;
import com.vrv.netmgr.entity.User;
import com.vrv.framework.dao.mybatis.BaseMyBatisDAOImpl;

@Repository(value = "userDao")
public class UserDAOImpl extends BaseMyBatisDAOImpl<User, String> implements UserDAO {

	@Override
	public List<User> findUserByLoginId(String name) {
		String mapper = getMapperNamesapce() + ".searchUserByLoginId";
		return getSqlSessionTemplate().selectList(mapper, name);
	}

}
