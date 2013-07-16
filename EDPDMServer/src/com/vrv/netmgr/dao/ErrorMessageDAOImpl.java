package com.vrv.netmgr.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.vrv.common.utils.DateUtil;
import com.vrv.common.utils.StringUtil;
import com.vrv.framework.dao.mybatis.BaseMyBatisDAOImpl;
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
@Repository(value = "errorMessageDao")
public class ErrorMessageDAOImpl extends BaseMyBatisDAOImpl<ErrorMessage, String> implements ErrorMessageDAO {

    @Override
    public Map<String, Long> statisticErrorMsgByRegion(WarningInfoStatisticsSearchCondition searchCondition) {
        List<Long> result = getSqlSessionTemplate().selectList(getMapperNamesapce() + ".statisticErrorMsgByRegion", searchCondition);
        Map<String, Long> valMap = new HashMap<String, Long>();
        valMap.put("ffwl", result.get(0));
        valMap.put("sbbh", result.get(1));
        valMap.put("ipbh", result.get(2));
        valMap.put("ttxz", result.get(3));
        valMap.put("llyc", result.get(4));
        valMap.put("zdbj", result.get(5));
        return valMap;
    }

    @Override
    public long findUnreadErrorInfoCount(ErrorMessageSearchCondition searchCondition) {
        long result = getSqlSessionTemplate().selectOne(getMapperNamesapce() + ".searchUnreadErrorInfoCount", searchCondition);
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.vrv.netmgr.dao.ErrorMessageDAO#findPastWeekErrorInfo(com.vrv.netmgr
     * .vo.ErrorMessageSearchCondition)
     */
    @Override
    public List<Map<String, String>> findPastWeekErrorInfo(ErrorMessageSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".searchPastWeekErrorInfo";
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();

        String[] paramArray = new String[7];
        for (int i = 1; i <= 7; i++) {
            Date date = DateUtil.getNextNDay(DateUtil.getDateNow(), -i);
            paramArray[i - 1] = DateUtil.getDateTime(DateUtil.getDatePattern(), date);
        }
        List<Map<String, String>> valList = getSqlSessionTemplate().selectList(mapper, paramArray);
        for (int i = 0; i < paramArray.length; i++) {
            Map<String, String> varMap = new HashMap<String, String>();
            varMap.put(paramArray[i], "0");
            for (int j = 0; (null != valList && j < valList.size()); j++) {
                String errorTime = valList.get(j).get("ErrorTime");
                // String val = valList.get(j).get(paramArray[i]);
                if (StringUtil.isValidString(errorTime) && errorTime.equals(paramArray[i])) {
                    varMap.put(paramArray[i], String.valueOf(valList.get(j).get("Num")));
                    break;
                }
            }
            result.add(varMap);
        }

        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.vrv.netmgr.dao.ErrorMessageDAO#findWarningInfoByDevice(com.vrv.netmgr
     * .vo.WarningInfoByDeviceSearchCondition)
     */
    @Override
    public List<Map<String, String>> findWarningInfoByDevice(WarningInfoByDeviceSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".searchWarningInfoByDevice";
        List<Map<String, String>> result = getSqlSessionTemplate().selectList(mapper, searchCondition);
        return result;
    }
}
