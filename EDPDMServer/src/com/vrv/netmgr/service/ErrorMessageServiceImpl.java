package com.vrv.netmgr.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.framework.vo.Page;
import com.vrv.netmgr.dao.ErrorMessageDAO;
import com.vrv.netmgr.entity.ErrorMessage;
import com.vrv.netmgr.vo.ErrorMessageSearchCondition;
import com.vrv.netmgr.vo.WarningInfoByDeviceSearchCondition;
import com.vrv.netmgr.vo.WarningInfoStatisticsSearchCondition;

/**
 * ErrorMessage service实现类
 *
 * @author 曹保利
 * @version 1.0
 *
 */
@Service(value = "errorMessageService")
public class ErrorMessageServiceImpl extends EntityServiceImpl<ErrorMessage> implements ErrorMessageService {

    @Autowired
    private ErrorMessageDAO errorMessageDao;

    @Autowired
    @Qualifier("errorMessageDao")
    public void setErrorMessageDao(BaseDAO<ErrorMessage, Serializable> errorMessageDao) {
        super.dao = errorMessageDao;
    }

    @Override
    public Page searchNetworkIPPage(ErrorMessageSearchCondition searchCondition) {
        return errorMessageDao.pageQuery("statisticVisitNetworkPageByIp", searchCondition);
    }

    @Override
    public Page searchNetworkAreaPage(ErrorMessageSearchCondition searchCondition) {
        return errorMessageDao.pageQuery("statisticVisitNetworkPageByArea", searchCondition);
    }

    @Override
    public Page searchNetworkYearPage(ErrorMessageSearchCondition searchCondition) {
        return errorMessageDao.pageQuery("statisticVisitNetworkPageByYear", searchCondition);
    }

    @Override
    public Page searchNetworkMonthPage(ErrorMessageSearchCondition searchCondition) {
        return errorMessageDao.pageQuery("statisticVisitNetworkPageByMonth", searchCondition);
    }

    @Override
    public Map<String, Long> getErrorMsgStatisticsByRegion(WarningInfoStatisticsSearchCondition searchCondition) {
        return errorMessageDao.statisticErrorMsgByRegion(searchCondition);
    }

    @Override
    public long getUnreadErrorInfoCount(ErrorMessageSearchCondition searchCondition) {
        return errorMessageDao.findUnreadErrorInfoCount(searchCondition);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.vrv.netmgr.service.ErrorMessageService#getPastWeekErrorInfo(com.vrv
     * .netmgr.vo.ErrorMessageSearchCondition)
     */
    @Override
    public List<Map<String, String>> getPastWeekErrorInfo(ErrorMessageSearchCondition searchCondition) {
        return errorMessageDao.findPastWeekErrorInfo(searchCondition);
    }

    @Override
    public List<Map<String, String>> getWarningInfoByDevice(WarningInfoByDeviceSearchCondition searchCondition) {
        return errorMessageDao.findWarningInfoByDevice(searchCondition);
    }
}
