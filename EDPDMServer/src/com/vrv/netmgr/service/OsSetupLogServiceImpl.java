package com.vrv.netmgr.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.netmgr.dao.OsSetupLogDAO;
import com.vrv.netmgr.entity.OsSetupLog;

/**
 * OsSetupLog service实现类
 *
 * @author 曹保利
 * @version 1.0
 *
 */
@Service(value = "osSetupLogService")
public class OsSetupLogServiceImpl extends EntityServiceImpl<OsSetupLog> implements OsSetupLogService {

    @Autowired
    private OsSetupLogDAO osSetupLogDao;

    @Autowired
    @Qualifier("osSetupLogDao")
    public void setOsSetupLogDao(BaseDAO<OsSetupLog, Serializable> osSetupLogDAO) {
        super.dao = osSetupLogDAO;
    }
}
