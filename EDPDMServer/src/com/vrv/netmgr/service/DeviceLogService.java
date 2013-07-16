package com.vrv.netmgr.service;

import java.util.List;
import java.util.Map;

import com.vrv.framework.service.EntityService;
import com.vrv.netmgr.entity.DeviceLog;
import com.vrv.netmgr.vo.DeviceLogSearchCondition;

/**
 * DeviceLog service接口
 *
 * @author 曹保利
 * @version 1.0
 */
public interface DeviceLogService extends EntityService<DeviceLog> {

    /**
     * 获取过去5天的数据
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getTop5Info(DeviceLogSearchCondition searchCondition);
}
