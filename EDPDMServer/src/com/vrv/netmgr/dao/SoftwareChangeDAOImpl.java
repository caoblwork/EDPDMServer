package com.vrv.netmgr.dao;

import org.springframework.stereotype.Repository;

import com.vrv.framework.dao.mybatis.BaseMyBatisDAOImpl;
import com.vrv.netmgr.entity.SoftwareChange;

/**
 * SoftwareChangeDAO
 *
 * @author 曹保利
 * @version 1.0
 */
@Repository(value = "softwareChangeDao")
public class SoftwareChangeDAOImpl extends BaseMyBatisDAOImpl<SoftwareChange, Long> implements SoftwareChangeDAO {

}
