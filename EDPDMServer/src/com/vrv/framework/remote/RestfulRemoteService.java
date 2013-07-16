package com.vrv.framework.remote;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.vrv.framework.dao.domain.BaseEntity;
import com.vrv.framework.service.EntityService;
import com.vrv.framework.service.LogicProcessResult;
import com.vrv.framework.vo.Messages;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.PresentationVo;
import com.vrv.framework.vo.SearchCondition;

/**
 *
 * 负责处理JSON数据的基类
 * <ul>
 * 输入输出说明
 * <li>
 * <ol>
 * 输入参数说明:
 * <li>使用封装有分页信息的SearchCondition</li>
 * <li>对于不需要分页数据的业务使用业务实体类接收参数</li>
 * </ol>
 *
 * <li>输出参数说明:
 * <ol>
 * <li>统一使用PresentationVo来封装请求信息、数据验证信息、单记录、多记录、以及分页信息</li>
 * </ol>
 * </li>
 * </ul>
 *
 * @author 曹保利
 *
 */
public class RestfulRemoteService<Entity extends BaseEntity, SC extends SearchCondition> {

    /** 日志记录对象 */
    protected Logger logger = LoggerFactory.getLogger(getClass());

    /** 子类注入绑定业务实体的service */
    private EntityService<Entity> entityService;

    /**
     * @param service
     *            the service to set
     */

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void setEntityService(EntityService service) {
        this.entityService = service;
    }

    public RestfulRemoteService() {
        super();
    }

    /**
     *
     * 带有分页信息list的json数据处理
     *
     * @param searchCondition
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "jsonList.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonList(@Valid SC searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonList.do");
        prepareSearchCondition(searchCondition);
        Page page = (Page) entityService.searchAndCount(searchCondition);
        decorateSearchResult(page, searchCondition);
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
        logger.debug("end process jsonList.do");
        return presentationVo;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "jsonSave.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonSave(HttpServletRequest request, @Valid Entity entity, BindingResult bindingResult) {
        logger.debug("beging process jsonSave.do");

        PresentationVo presentationVo = new PresentationVo();
        if (bindingResult.hasErrors()) {
            List<FieldError> errors = bindingResult.getFieldErrors();
            Messages messages = new Messages();
            WebApplicationContext webApplicationContext = RequestContextUtils.getWebApplicationContext(request, request.getSession().getServletContext());
            for (FieldError error : errors) {
                String messageContent = webApplicationContext.getMessage(error, request.getLocale());
                messages.add(messageContent);
            }
            presentationVo.setMessages(messages);
            presentationVo.setSuccess(false);
            logger.error(bindingResult.getAllErrors().toString());
        } else {
            LogicProcessResult logicProcessResult = entityService.save(entity);
            entity = (Entity) logicProcessResult.getResultObject();
            if (entity == null) {
                Messages messages = new Messages("数据保存失败！");
                presentationVo.setMessages(messages);
                presentationVo.setSuccess(false);
            } else {
                presentationVo.setRecord(entity);
                Messages messages = new Messages("数据保存成功！");
                presentationVo.setMessages(messages);
                presentationVo.setSuccess(true);
            }
        }
        logger.debug("end process jsonSave.do");
        return presentationVo;
    }

    @RequestMapping(value = "jsonRemove.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonRemove(String id) {
        logger.debug("beging process jsonRemove.do");
        entityService.remove(id);
        PresentationVo presentationVo = new PresentationVo();
        Messages messages = new Messages("数据删除成功！");
        presentationVo.setMessages(messages);
        presentationVo.setSuccess(true);
        logger.debug("end process jsonRemove.do");
        return presentationVo;
    }

    protected void decorateSearchResult(Page page, SearchCondition searchCondition) {
        // TODO 扩展page中的对象展示
    }

    protected void prepareSearchCondition(SearchCondition searchCondition) {
        // TODO 添加查询条件
    }
}
