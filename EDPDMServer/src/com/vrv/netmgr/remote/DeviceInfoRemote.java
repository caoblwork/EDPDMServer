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

import com.vrv.common.utils.StringUtil;
import com.vrv.framework.remote.RestfulRemoteService;
import com.vrv.framework.vo.Messages;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.PresentationVo;
import com.vrv.framework.vo.SearchCondition;
import com.vrv.netmgr.entity.DeviceInfo;
import com.vrv.netmgr.entity.Equipment;
import com.vrv.netmgr.service.DeviceInfoService;
import com.vrv.netmgr.vo.DeviceInfoSearchCondition;

/**
 *
 * @author 曹保利
 *
 */
@Controller
@RequestMapping(value = "/deviceInfo")
public class DeviceInfoRemote extends RestfulRemoteService<DeviceInfo, DeviceInfoSearchCondition> {

    @Autowired
    public void setDeviceInfoService(DeviceInfoService service) {
        setEntityService(service);
    }

    @Autowired
    private DeviceInfoService deviceInfoService;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @Override
    protected void decorateSearchResult(Page page, SearchCondition searchCondition) {
        List<Object> voList = (List<Object>) page.getResult();
        for (Object obj : voList) {
            DeviceInfo vo = (DeviceInfo) obj;
            // List<Hardware> hardwares =
            // deviceInfoService.getHardwareInfoByDeviceId(vo.getDeviceId());
            List<Equipment> hardwares = deviceInfoService.getEquipmentInfoByDeviceId(vo.getDeviceId());
            StringBuilder sb = new StringBuilder();
            for (Equipment h : hardwares) {

                sb.append(h.getEquipmentName()).append(":").append(h.getEquipmentDescription()).append(";");

                if (StringUtil.isValidString(h.getDescription1())) {
                    sb.append(h.getDescription1()).append(";");
                }
                if (StringUtil.isValidString(h.getDescription2())) {
                    sb.append(h.getDescription2()).append(";");
                }
            }
            vo.setDescription(sb.toString());
        }

    }

    @RequestMapping(value = "jsonSoftwareList.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonSoftwareList(SearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonSoftwareList.do");
        // prepareSearchCondition(searchCondition);
        Page page = (Page) deviceInfoService.searchSoftwarePage(searchCondition);
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
        logger.debug("end process jsonSoftwareList.do");
        return presentationVo;
    }

    @RequestMapping(value = "jsonDeviceList.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo jsonDeviceList(SearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonDeviceList.do");
        // prepareSearchCondition(searchCondition);
        Page page = (Page) deviceInfoService.searchjsonDeviceListPage(searchCondition);
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
        logger.debug("end process jsonDeviceList.do");
        return presentationVo;
    }

    @RequestMapping(value = "getLocalDeviceRegisterInfo.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getLocalDeviceRegisterInfo(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonStatisticVisitNetworkByMonth.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, Long>> varList = deviceInfoService.getLocalDeviceRegisterInfo(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, Long> map : varList) {
            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);
        return presentationVo;
    }

    @RequestMapping(value = "getDeviceResourceByOSType.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getDeviceResourceByOSType(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getDeviceResourceByOSType.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getDeviceResourceByOSType(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {

            String persent = String.format("%.2f", map.get("persent"));
            map.put("persent", persent);

            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);
        return presentationVo;
    }

    @RequestMapping(value = "getDeviceResourceByMemery.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getDeviceResourceByMemery(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getDeviceResourceByMemery.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getDeviceResourceByMemery(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {

            String persent = String.format("%.2f", map.get("persent"));
            map.put("persent", persent);

            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);
        return presentationVo;
    }

    @RequestMapping(value = "getDeviceResourceByCPUFrequency.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getDeviceResourceByCPUFrequency(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getDeviceResourceByCPUFrequency.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getDeviceResourceByCPUFrequency(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {

            String persent = String.format("%.2f", map.get("persent"));
            map.put("persent", persent);

            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);
        return presentationVo;
    }

    @RequestMapping(value = "getDeviceResourceByCPUType.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getDeviceResourceByCPUType(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getDeviceResourceByCPUType.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getDeviceResourceByCPUType(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {

            String persent = String.format("%.2f", map.get("persent"));
            map.put("persent", persent);

            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);
        return presentationVo;
    }

    @RequestMapping(value = "getDeviceResourceByDiskSize.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getDeviceResourceByDiskSize(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getDeviceResourceByDiskSize.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getDeviceResourceByDiskSize(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {

            String persent = String.format("%.2f", map.get("persent"));
            map.put("persent", persent);

            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);
        return presentationVo;
    }

    @RequestMapping(value = "getDeviceResourceByType.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getDeviceResourceByType(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getDeviceResourceByDiskSize.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getDeviceResourceByType(searchCondition);
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

    /**
     * 获取所有设备IP信息列表服务端接口
     *
     * @param searchCondition
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "jsonIPList.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getjsonIPList(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process jsonIPList.do");
        Page page = (Page) deviceInfoService.getIPInfo(searchCondition);
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
        logger.debug("end process jsonIPList.do");
        return presentationVo;
    }

    /**
     * 杀毒软件安装情况统计
     *
     * @param searchCondition
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "getKvsInstallInfo.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getKvsInstallInfo(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getKvsInstallInfo.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getKvsInstallInfo(searchCondition);
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

    /**
     * IP使用情况统计
     *
     * @param searchCondition
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "getIpUseageInfo.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getIpUseageInfo(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getIpUseageInfo.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getIpUseageInfo(searchCondition);
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

    /**
     * 本地漏洞统计
     *
     * @param searchCondition
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "getPatchInfo.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public PresentationVo getPatchInfo(DeviceInfoSearchCondition searchCondition, BindingResult bindingResult) {
        logger.debug("beging process getPatchInfo.do");
        PresentationVo presentationVo = new PresentationVo();
        List<Map<String, String>> varList = deviceInfoService.getPatchInfo(searchCondition);
        List<Object> objList = new ArrayList<Object>();
        for (Map<String, String> map : varList) {
            Object obj = (Object) map;
            objList.add(obj);
        }
        presentationVo.setRecords(objList);
        presentationVo.setTotalRecords(new Long(objList.size()));
        presentationVo.setSuccess(Boolean.TRUE);

        logger.debug("ending process getPatchInfo.do");
        return presentationVo;
    }

}
