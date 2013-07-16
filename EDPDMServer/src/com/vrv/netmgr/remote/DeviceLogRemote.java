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
import com.vrv.netmgr.entity.DeviceLog;
import com.vrv.netmgr.service.DeviceLogService;
import com.vrv.netmgr.vo.DeviceLogSearchCondition;

/**
 * @author 曹保利
 *
 */
@Controller
@RequestMapping(value = "/deviceLog")
public class DeviceLogRemote extends RestfulRemoteService<DeviceLog, DeviceLogSearchCondition> {

    @Autowired
    public void setDeviceLogService(DeviceLogService service) {
        setEntityService(service);
    }

    @Autowired
    private DeviceLogService deviceLogService;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    /**
     * IP使用情况统计
     *
     * @param searchCondition
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "getTop5Info.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getPatchInfo(DeviceLogSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getTop5Info.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceLogService.getTop5Info(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {
            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);

        logger.debug("ending process getTop5Info.do");
        return presentationVo;
    }

}
