package com.vrv.netmgr.remote;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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

import com.vrv.common.utils.StringUtil;
import com.vrv.framework.remote.RestfulRemoteService;
import com.vrv.framework.vo.Messages;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.PresentationVo;
import com.vrv.framework.vo.SearchCondition;
import com.vrv.netmgr.entity.ErrorMessage;
import com.vrv.netmgr.service.ErrorMessageService;
import com.vrv.netmgr.vo.ErrorMessageSearchCondition;

/**
 * ErrorMessageController对象
 *
 * @author 曹保利
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/errorMessage")
public class ErrorMessageRemote extends RestfulRemoteService<ErrorMessage, ErrorMessageSearchCondition> {

    @Autowired
    public void setErrorMessageService(ErrorMessageService service) {
        setEntityService(service);
    }

    @Autowired
    private ErrorMessageService errorMessageService;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @Override
    protected void prepareSearchCondition(SearchCondition searchCondition) {
        super.prepareSearchCondition(searchCondition);

        ErrorMessageSearchCondition condition = (ErrorMessageSearchCondition) searchCondition;
        if (StringUtil.isValidString(condition.getErrorMsg())) {
            try {
                condition.setErrorMsg(URLDecoder.decode(condition.getErrorMsg(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                logger.info("中文参数解码异常！");
                e.printStackTrace();
            }
        }
    }

    @RequestMapping(value = "jsonStatisticVisitNetworkByIp.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonStatisticVisitNetworkByIp(ErrorMessageSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonStatisticVisitNetworkByIp.do");

        Page page = (Page) errorMessageService.searchNetworkIPPage(searchCondition);
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
        logger.debug("end process jsonStatisticVisitNetworkByIp.do");
        return presentationVo;
    }

    @RequestMapping(value = "jsonStatisticVisitNetworkByArea.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonStatisticVisitNetworkByArea(ErrorMessageSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonStatisticVisitNetworkByArea.do");
        // prepareSearchCondition(searchCondition);
        Page page = (Page) errorMessageService.searchNetworkAreaPage(searchCondition);
        // decorateSearchResult(page, searchCondition);
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
        logger.debug("end process jsonStatisticVisitNetworkByArea.do");
        return presentationVo;
    }

    @RequestMapping(value = "jsonStatisticVisitNetworkByYear.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonStatisticVisitNetworkByYear(ErrorMessageSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonStatisticVisitNetworkByYear.do");
        // prepareSearchCondition(searchCondition);
        Page page = (Page) errorMessageService.searchNetworkYearPage(searchCondition);
        // decorateSearchResult(page, searchCondition);
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
        logger.debug("end process jsonStatisticVisitNetworkByYear.do");
        return presentationVo;
    }

    @RequestMapping(value = "jsonStatisticVisitNetworkByMonth.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonStatisticVisitNetworkByMonth(ErrorMessageSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonStatisticVisitNetworkByMonth.do");
        // prepareSearchCondition(searchCondition);
        Page page = (Page) errorMessageService.searchNetworkMonthPage(searchCondition);
        // decorateSearchResult(page, searchCondition);
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
        logger.debug("end process jsonStatisticVisitNetworkByMonth.do");
        return presentationVo;
    }

    @RequestMapping(value = "getUnreadErrorInfoCount.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getUnreadErrorInfoCount(ErrorMessageSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getUnreadErrorInfoCount.do");
        PresentationVo presentationVo = new PresentationVo();
        long count = errorMessageService.getUnreadErrorInfoCount(searchCondition);
        presentationVo.setTotalRecords(count);
        presentationVo.setSuccess(Boolean.TRUE);
        return presentationVo;
    }

    @RequestMapping(value = "getPastWeekErrorInfo.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getPastWeekErrorInfo(ErrorMessageSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getPastWeekErrorInfo.do");

        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = errorMessageService.getPastWeekErrorInfo(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {
            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);
        return presentationVo;
    }
}
