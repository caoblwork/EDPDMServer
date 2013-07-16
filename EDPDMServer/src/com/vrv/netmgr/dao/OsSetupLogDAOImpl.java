package com.vrv.netmgr.dao;

import org.springframework.stereotype.Repository;

import com.vrv.framework.dao.mybatis.BaseMyBatisDAOImpl;
import com.vrv.netmgr.entity.OsSetupLog;

/**
 * OsSetupLogDAO
 *
 * @author 曹保利
 * @version 1.0
 */
@Repository(value = "osSetupLogDao")
public class OsSetupLogDAOImpl extends BaseMyBatisDAOImpl<OsSetupLog, String> implements OsSetupLogDAO {

}
