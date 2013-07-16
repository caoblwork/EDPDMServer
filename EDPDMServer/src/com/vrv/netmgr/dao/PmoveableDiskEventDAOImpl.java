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
import com.vrv.netmgr.entity.PmoveableDiskEvent;
import com.vrv.netmgr.vo.PmoveableDiskEventSearchCondition;

/**
 * PmoveableDiskEventDAO
 *
 * @author 曹保利
 * @version 1.0
 */
@Repository(value = "pmoveableDiskEventDao")
public class PmoveableDiskEventDAOImpl extends BaseMyBatisDAOImpl<PmoveableDiskEvent, String> implements PmoveableDiskEventDAO {

    /*
     * (non-Javadoc)
     *
     * @see
     * com.vrv.netmgr.dao.PmoveableDiskEventDAO#findPastWeekAuditInfo(com.vrv
     * .netmgr.vo.PmoveableDiskEventSearchCondition)
     */
    @Override
    public List<Map<String, String>> findPastWeekAuditInfo(PmoveableDiskEventSearchCondition searchCondition) {
        String mapper = getMapperNamesapce() + ".searchPastWeekAuditInfo";
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
                String errorTime = valList.get(j).get("AuditTime");
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
