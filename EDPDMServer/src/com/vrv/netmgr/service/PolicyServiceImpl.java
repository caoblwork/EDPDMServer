package com.vrv.netmgr.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.netmgr.dao.PolicyDAO;
import com.vrv.netmgr.entity.Policy;

/**
 * Policy service实现类
 * 
 * @author 曹保利
 * @version 1.0
 * 
 */
@Service(value = "policyService")
public class PolicyServiceImpl extends EntityServiceImpl<Policy> implements PolicyService {

	@Autowired
	private PolicyDAO policyDao;

	@Autowired
	@Qualifier("policyDao")
	public void setPolicyDao(BaseDAO<Policy, Serializable> policyDao) {
		super.dao = policyDao;
	}
}
