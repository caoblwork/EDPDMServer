package com.vrv.netmgr.dao;

import java.util.List;
import java.util.Map;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.netmgr.entity.PmoveableDiskEvent;
import com.vrv.netmgr.vo.PmoveableDiskEventSearchCondition;

/**
 * PmoveableDiskEventDAO 审计信息表数据库持久层服务
 *
 * @author 曹保利
 * @version 1.0
 */
public interface PmoveableDiskEventDAO extends BaseDAO<PmoveableDiskEvent, String> {

    /**
     * 统计过去一周的审计信息
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findPastWeekAuditInfo(PmoveableDiskEventSearchCondition searchCondition);

}
