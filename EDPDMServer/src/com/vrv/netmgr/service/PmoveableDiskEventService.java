package com.vrv.netmgr.service;

import java.util.List;
import java.util.Map;

import com.vrv.framework.service.EntityService;
import com.vrv.framework.vo.Page;
import com.vrv.netmgr.entity.PmoveableDiskEvent;
import com.vrv.netmgr.vo.PmoveableDiskEventSearchCondition;
import com.vrv.netmgr.vo.WarningInfoByDeviceSearchCondition;

/**
 * PmoveableDiskEvent service接口
 *
 * @author 曹保利
 * @version 1.0
 */
public interface PmoveableDiskEventService extends EntityService<PmoveableDiskEvent> {

    /**
     * 统计过去一周的审计情况
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getPastWeekAuditInfo(PmoveableDiskEventSearchCondition searchCondition);

    /**
     * 违规软件及进程相关审计信息
     *
     * @param searchCondition
     * @return
     */
    Page getSoftAndProcInfo(WarningInfoByDeviceSearchCondition searchCondition);
}
