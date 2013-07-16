package com.vrv.netmgr.dao;

import org.springframework.stereotype.Repository;

import com.vrv.framework.dao.mybatis.BaseMyBatisDAOImpl;
import com.vrv.netmgr.entity.HardwareChange;

/**
 * HardwareChangeDAO
 *
 * @author 修改成自己的名字
 * @version 1.0
 */
@Repository(value = "hardwareChangeDao")
public class HardwareChangeDAOImpl extends BaseMyBatisDAOImpl<HardwareChange, Long> implements HardwareChangeDAO {

}
