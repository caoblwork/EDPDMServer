package com.vrv.netmgr.remote;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vrv.framework.vo.Messages;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.PresentationVo;
import com.vrv.netmgr.service.ErrorMessageService;
import com.vrv.netmgr.service.PmoveableDiskEventService;
import com.vrv.netmgr.vo.WarningInfoByDeviceSearchCondition;
import com.vrv.netmgr.vo.WarningInfoStatisticsSearchCondition;

@Controller
@RequestMapping(value = "/warningInfo/statistics/*")
public class WarningInfoStatistics {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ErrorMessageService errorMessageService;

    @Autowired
    private PmoveableDiskEventService pmoveableDiskEventService;

    @RequestMapping(value = "warningInfoStatisticsByRegion.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo warningInfoStatisticsByRegion(WarningInfoStatisticsSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("bengin to process warningInfoStatisticsByRegion.do");
        Map<String, Long> result = errorMessageService.getErrorMsgStatisticsByRegion(searchCondition);
        PresentationVo presentationVo = new PresentationVo();
        presentationVo.setSuccess(Boolean.TRUE);
        presentationVo.setRecord(result);
        presentationVo.setMessages(new Messages("按区域统计报警数据！"));
        logger.debug("end    to process warningInfoStatisticsByRegion.do");
        return presentationVo;
    }

    /**
     * 根据设备相关信息获取（报警/审计）相关信息
     *
     * @param searchCondition
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "warningInfoByDevice", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo warningInfoByDevice(WarningInfoByDeviceSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("bengin to process warningInfoByDevice.do");
        List<Map<String, String>> result = errorMessageService.getWarningInfoByDevice(searchCondition);
        PresentationVo presentationVo = new PresentationVo();
        presentationVo.setSuccess(Boolean.TRUE);
        presentationVo.setRecord(result);
        presentationVo.setMessages(new Messages("按区域统计报警数据！"));
        logger.debug("end    to process warningInfoByDevice.do");
        return presentationVo;
    }

    /**
     * 违规软件及进程相关审计信息
     *
     * @param searchCondition
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "softAndProcInfo.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo softAndProcInfo(WarningInfoByDeviceSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("bengin to process softAndProcInfo.do");
        Page page = (Page) pmoveableDiskEventService.getSoftAndProcInfo(searchCondition);
        PresentationVo presentationVo = new PresentationVo();
        if (bindingResult.hasErrors()) {
            Messages messages = new Messages("查询的数据记录不存在.");
            presentationVo.setMessages(messages);
            presentationVo.setSuccess(false);
            logger.error(bindingResult.getAllErrors().toString());
        } else {
            Messages messages = new Messages("数据加载成功！");
            presentationVo.setMessages(messages);
            presentationVo.setSuccess(true);
        }
        presentationVo.setRecords(page.getResult());
        presentationVo.setTotalRecords(new Long(page.getTotalCount()));
        logger.debug("end    to process softAndProcInfo.do");
        return presentationVo;
    }
}
