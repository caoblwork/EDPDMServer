package com.vrv.netmgr.remote;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vrv.framework.remote.RestfulRemoteService;
import com.vrv.framework.vo.PresentationVo;
import com.vrv.netmgr.entity.PmoveableDiskEvent;
import com.vrv.netmgr.service.PmoveableDiskEventService;
import com.vrv.netmgr.vo.PmoveableDiskEventSearchCondition;

/**
 * 审计信息表（原移动硬盘策略事件表）Restful处理
 *
 * @author 曹保利
 *
 */
@Controller
@RequestMapping(value = "/pmoveableDiskEvent")
public class PmoveableDiskEventRemote extends RestfulRemoteService<PmoveableDiskEvent, PmoveableDiskEventSearchCondition> {

    @Autowired
    public void setPmoveableDiskEventService(PmoveableDiskEventService service) {
        setEntityService(service);
    }

    @Autowired
    private PmoveableDiskEventService pmoveableDiskEventService;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @RequestMapping(value = "getPastWeekAuditInfo.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getPastWeekAuditInfo(PmoveableDiskEventSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getPastWeekAuditInfo.do");

        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = pmoveableDiskEventService.getPastWeekAuditInfo(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {
            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);

        logger.debug("ended  process getPastWeekAuditInfo.do");
        return presentationVo;
    }

}
