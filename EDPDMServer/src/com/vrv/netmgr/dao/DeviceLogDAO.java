package com.vrv.netmgr.dao;

import java.util.List;
import java.util.Map;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.netmgr.entity.DeviceLog;
import com.vrv.netmgr.vo.DeviceLogSearchCondition;

/**
 * DeviceLogDAO
 *
 * @author 曹保利
 * @version 1.0
 */
public interface DeviceLogDAO extends BaseDAO<DeviceLog, String> {

    /**
     * 获取过去5天的数据
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findTop5Info(DeviceLogSearchCondition searchCondition);

}
