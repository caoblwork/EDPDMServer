package com.vrv.netmgr.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.service.EntityServiceImpl;
import com.vrv.framework.service.LogicProcessResult;
import com.vrv.framework.vo.Page;
import com.vrv.netmgr.dao.PmoveableDiskEventDAO;
import com.vrv.netmgr.entity.PmoveableDiskEvent;
import com.vrv.netmgr.vo.PmoveableDiskEventSearchCondition;
import com.vrv.netmgr.vo.WarningInfoByDeviceSearchCondition;

/**
 * PmoveableDiskEvent service实现类
 *
 * @author 曹保利
 * @version 1.0
 *
 */
@Service(value = "pmoveableDiskEventService")
public class PmoveableDiskEventServiceImpl extends EntityServiceImpl<PmoveableDiskEvent> implements PmoveableDiskEventService {

    @Autowired
    private PmoveableDiskEventDAO pmoveableDiskEventDao;

    @Autowired
    @Qualifier("pmoveableDiskEventDao")
    public void setPmoveableDiskEventDao(BaseDAO<PmoveableDiskEvent, Serializable> pmoveableDiskEventDao) {
        super.dao = pmoveableDiskEventDao;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.vrv.netmgr.service.PmoveableDiskEventService#getPastWeekAuditInfo
     * (com.vrv.netmgr.vo.PmoveableDiskEventSearchCondition)
     */
    @Override
    public List<Map<String, String>> getPastWeekAuditInfo(PmoveableDiskEventSearchCondition searchCondition) {
        return pmoveableDiskEventDao.findPastWeekAuditInfo(searchCondition);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.vrv.netmgr.service.PmoveableDiskEventService#getSoftAndProcInfo(com
     * .vrv.netmgr.vo.WarningInfoByDeviceSearchCondition)
     */
    @Override
    public Page getSoftAndProcInfo(WarningInfoByDeviceSearchCondition searchCondition) {
        return pmoveableDiskEventDao.pageQuery("selectSoftAndProcInfo", searchCondition);
    }
}
