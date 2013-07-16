package com.vrv.netmgr.remote;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vrv.framework.remote.RestfulRemoteService;
import com.vrv.netmgr.entity.SoftwareChange;
import com.vrv.netmgr.service.SoftwareChangeService;
import com.vrv.netmgr.vo.SoftwareChangeSearchCondition;

/**
 * @author 曹保利
 *
 */
@Controller
@RequestMapping(value = "/softwareChange")
public class SoftwareChangeRemote extends RestfulRemoteService<SoftwareChange, SoftwareChangeSearchCondition> {

    @Autowired
    private SoftwareChangeService softwareChangeService;

    @Autowired
    public void setSoftwareChangeService(SoftwareChangeService service) {
        setEntityService(service);
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

}
