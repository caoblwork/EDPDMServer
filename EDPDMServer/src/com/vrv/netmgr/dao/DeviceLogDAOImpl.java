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
import com.vrv.netmgr.entity.DeviceLog;
import com.vrv.netmgr.vo.DeviceLogSearchCondition;

/**
 * DeviceLogDAO
 *
 * @author 曹保利
 * @version 1.0
 */
@Repository(value = "deviceLogDao")
public class DeviceLogDAOImpl extends BaseMyBatisDAOImpl<DeviceLog, String> implements DeviceLogDAO {

    /*
     * (non-Javadoc)
     *
     * @see com.vrv.netmgr.dao.DeviceLogDAO#findTop5Info(com.vrv.netmgr.vo.
     * DeviceInfoSearchCondition)
     */
    @Override
    public List<Map<String, String>> findTop5Info(DeviceLogSearchCondition searchCondition) {
//        String mapper = getMapperNamesapce() + ".searchDeviceLogByDate";
//        List<Map<String, String>> valList = new ArrayList<Map<String, String>>();
//        Map<String, String> valMap = new HashMap<String, String>();

//        for (int i = 1; i <= 5; i++) {
//            Date date = DateUtil.getNextNDay(DateUtil.getDateNow(), -i);
//            String dateStr = DateUtil.getDateTime(DateUtil.getDatePattern(), date);
//            searchCondition.setLogTime(dateStr);
//            Long val = getSqlSessionTemplate().selectOne(mapper, searchCondition);
//
//            valMap.put(dateStr, String.valueOf((val != null && (val > 0)) ? val : 0L));
//        }
//        valList.add(valMap);
//        return valList;



        String mapper = getMapperNamesapce() + ".searchDeviceLogByDate";
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();

        String[] paramArray = new String[5];
        for (int i = 1; i <= 5; i++) {
            Date date = DateUtil.getNextNDay(DateUtil.getDateNow(), -i);
            paramArray[i - 1] = DateUtil.getDateTime(DateUtil.getDatePattern(), date);
        }
        List<Map<String, String>> valList = getSqlSessionTemplate().selectList(mapper, paramArray);
        for (int i = 0; i < paramArray.length; i++) {
            Map<String, String> varMap = new HashMap<String, String>();
            varMap.put(paramArray[i], "0");
            for (int j = 0; (null != valList && j < valList.size()); j++) {
                String errorTime = valList.get(j).get("LogTime");
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

}
