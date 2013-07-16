package com.vrv.netmgr.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.netmgr.dao.DeviceLogDAO;
import com.vrv.netmgr.entity.DeviceLog;
import com.vrv.netmgr.vo.DeviceLogSearchCondition;

/**
 * DeviceLog service实现类
 *
 * @author 曹保利
 * @version 1.0
 *
 */
@Service(value = "deviceLogService")
public class DeviceLogServiceImpl extends EntityServiceImpl<DeviceLog> implements DeviceLogService {

    @Autowired
    private DeviceLogDAO deviceLogDao;

    @Autowired
    @Qualifier("deviceInfoDao")
    public void setDeviceInfoDao(BaseDAO<DeviceLog, Serializable> deviceLogDao) {
        super.dao = deviceLogDao;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.vrv.netmgr.service.DeviceLogService#getTop5Info(com.vrv.netmgr.vo
     * .DeviceInfoSearchCondition)
     */
    @Override
    public List<Map<String, String>> getTop5Info(DeviceLogSearchCondition searchCondition) {
        return deviceLogDao.findTop5Info(searchCondition);
    }
}
