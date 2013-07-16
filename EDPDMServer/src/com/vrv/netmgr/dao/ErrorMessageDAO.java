package com.vrv.netmgr.dao;

import java.util.List;
import java.util.Map;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.netmgr.entity.ErrorMessage;
import com.vrv.netmgr.vo.ErrorMessageSearchCondition;
import com.vrv.netmgr.vo.WarningInfoByDeviceSearchCondition;
import com.vrv.netmgr.vo.WarningInfoStatisticsSearchCondition;

/**
 * ErrorMessageDAO
 *
 * @author 曹保利
 * @version 1.0
 */
public interface ErrorMessageDAO extends BaseDAO<ErrorMessage, String> {
    /**
     * 根据区域统计报警信息
     *
     * @param searchCondition
     * @return
     */
    Map<String, Long> statisticErrorMsgByRegion(WarningInfoStatisticsSearchCondition searchCondition);

    long findUnreadErrorInfoCount(ErrorMessageSearchCondition searchCondition);

    /**
     * 过去一周的报警统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findPastWeekErrorInfo(ErrorMessageSearchCondition searchCondition);

    /**
     * 根据设备相关信息获取（报警/审计）相关信息
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> findWarningInfoByDevice(WarningInfoByDeviceSearchCondition searchCondition);

}
