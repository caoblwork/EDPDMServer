package com.vrv.netmgr.service;

import java.util.List;
import java.util.Map;

import com.vrv.framework.service.EntityService;
import com.vrv.framework.vo.Page;
import com.vrv.netmgr.entity.ErrorMessage;
import com.vrv.netmgr.vo.ErrorMessageSearchCondition;
import com.vrv.netmgr.vo.WarningInfoByDeviceSearchCondition;
import com.vrv.netmgr.vo.WarningInfoStatisticsSearchCondition;

/**
 * ErrorMessage service接口
 *
 * @author 曹保利
 * @version 1.0
 */
public interface ErrorMessageService extends EntityService<ErrorMessage> {

    /**
     * 分页查违规上网信息
     *
     * @param searchCondition
     * @return
     */
    Page searchNetworkIPPage(ErrorMessageSearchCondition searchCondition);

    /**
     * 分页查违规上网信息
     *
     * @param searchCondition
     * @return
     */
    Page searchNetworkAreaPage(ErrorMessageSearchCondition searchCondition);

    /**
     * 分页查违规上网信息
     *
     * @param searchCondition
     * @return
     */
    Page searchNetworkYearPage(ErrorMessageSearchCondition searchCondition);

    /**
     * 分页查违规上网信息
     *
     * @param searchCondition
     * @return
     */
    Page searchNetworkMonthPage(ErrorMessageSearchCondition searchCondition);

    /**
     * 根据区域统计报警信息
     *
     * @param searchCondition
     * @return
     */
    Map<String, Long> getErrorMsgStatisticsByRegion(WarningInfoStatisticsSearchCondition searchCondition);

    /**
     * 根据报警类型查询该类型的未读的报警数据
     *
     * @param searchCondition
     * @return
     */
    long getUnreadErrorInfoCount(ErrorMessageSearchCondition searchCondition);

    /**
     * 过去一周的报警统计
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getPastWeekErrorInfo(ErrorMessageSearchCondition searchCondition);

    /**
     * 根据设备相关信息获取（报警/审计）相关信息
     *
     * @param searchCondition
     * @return
     */
    List<Map<String, String>> getWarningInfoByDevice(WarningInfoByDeviceSearchCondition searchCondition);
}
