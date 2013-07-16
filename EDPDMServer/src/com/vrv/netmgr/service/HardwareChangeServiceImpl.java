package com.vrv.netmgr.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.netmgr.dao.HardwareChangeDAO;
import com.vrv.netmgr.entity.HardwareChange;

/**
 * HardwareChange service实现类
 *
 * @author 修改成自己的名字
 * @version 1.0
 *
 */
@Service(value = "hardwareChangeService")
public class HardwareChangeServiceImpl extends EntityServiceImpl<HardwareChange> implements HardwareChangeService {

    @Autowired
    private HardwareChangeDAO hardwareChangeDao;

    @Autowired
    @Qualifier("hardwareChangeDao")
    public void setHardwareChangeDao(BaseDAO<HardwareChange, Serializable> hardwareChangeDao) {
        super.dao = hardwareChangeDao;
    }
}
