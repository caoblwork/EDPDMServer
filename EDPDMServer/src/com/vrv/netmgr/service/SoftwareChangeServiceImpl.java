package com.vrv.netmgr.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.netmgr.dao.SoftwareChangeDAO;
import com.vrv.netmgr.entity.SoftwareChange;

/**
 * SoftwareChange service实现类
 *
 * @author 曹保利
 * @version 1.0
 *
 */
@Service(value = "softwareChangeService")
public class SoftwareChangeServiceImpl extends EntityServiceImpl<SoftwareChange> implements SoftwareChangeService {

    @Autowired
    private SoftwareChangeDAO softwareChangeDao;

    @Autowired
    @Qualifier("softwareChangeDao")
    public void setSoftwareChangeDAO(BaseDAO<SoftwareChange, Serializable> softwareChangeDao) {
        super.dao = softwareChangeDao;
    }
}
