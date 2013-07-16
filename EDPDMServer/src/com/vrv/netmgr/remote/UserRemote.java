package com.vrv.netmgr.remote;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import com.vrv.framework.vo.Messages;
import com.vrv.framework.vo.PresentationVo;
import com.vrv.netmgr.entity.User;
import com.vrv.netmgr.service.UserService;
import com.vrv.netmgr.vo.UserSearchCondition;

@Controller
@RequestMapping(value = "/user")
public class UserRemote extends RestfulRemoteService<User, UserSearchCondition> {

	@Autowired
	public void setUserService(UserService service) {
		setEntityService(service);
	}

	@Autowired
	private UserService userService;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

	/**
	 * 用户登录请求处理
	 * 
	 * @param userSearchCondition
	 * @param bindingResult
	 * @return
	 */
	@RequestMapping(value = "login.do", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public PresentationVo login(UserSearchCondition userSearchCondition, BindingResult bindingResult) {
		logger.debug("beging process login.do");
		User user = userService.getUserByLoginId(userSearchCondition);
		PresentationVo presentationVo = new PresentationVo();
		if (user == null) {
			Messages messages = new Messages("查询的数据记录不存在.");
			presentationVo.setMessages(messages);
			presentationVo.setSuccess(false);
		} else {
			Messages messages = new Messages("登录成功！");
			presentationVo.setMessages(messages);
			presentationVo.setSuccess(true);
			presentationVo.setRecord(user);
		}
		return presentationVo;
	}
}
