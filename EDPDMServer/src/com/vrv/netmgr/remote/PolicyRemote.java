package com.vrv.netmgr.remote;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vrv.common.utils.StringUtil;
import com.vrv.framework.remote.RestfulRemoteService;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.SearchCondition;
import com.vrv.netmgr.entity.DeviceInfo;
import com.vrv.netmgr.entity.Policy;
import com.vrv.netmgr.service.DeviceInfoService;
import com.vrv.netmgr.service.PolicyService;
import com.vrv.netmgr.vo.PolicySearchCondition;

/**
 * PolicyListController对象
 *
 * @author 曹保利
 * @version 1.0
 */
@Controller
@RequestMapping("/policy/*")
public class PolicyRemote extends RestfulRemoteService<Policy, PolicySearchCondition> {

    @Autowired
    public void setPolicyService(PolicyService service) {
        setEntityService(service);
    }

    @Autowired
    private PolicyService PolicyService;

    @Autowired
    private DeviceInfoService deviceInfoService;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @Override
    protected void decorateSearchResult(Page page, SearchCondition searchCondition) {

        List<Object> objects = page.getResult();

        for (Object obj : objects) {
            Policy policy = (Policy) obj;
            String content = policy.getPolicyObject();

            // 解析策略对象
            Document doc = Jsoup.parse(content);
            String devices = doc.select("DeviceID").text();
            String deviceInfoDesc = "";
            if (StringUtil.isValidString(devices)) {
                if (devices.contains(",")) {
                    String[] deviceArray = devices.split(",");
                    for (int i = 0; i < deviceArray.length; i++) {
                        DeviceInfo deviceInfo = (DeviceInfo) deviceInfoService.get(deviceArray[i]).getResultObject();
                        if (null != deviceInfo) {
                            deviceInfoDesc = deviceInfo.getIpaddres() + ":" + deviceInfo.getDeviceName() + ";";
                        }
                    }
                } else {
                    DeviceInfo deviceInfo = (DeviceInfo) deviceInfoService.get(devices).getResultObject();
                    if (null != deviceInfo) {
                        deviceInfoDesc = deviceInfo.getIpaddres() + ":" + deviceInfo.getDeviceName() + ";";
                    }
                }
                deviceInfoDesc = deviceInfoDesc.contains(";") ? deviceInfoDesc.substring(0, deviceInfoDesc.length() - 1 > 0 ? deviceInfoDesc.length() - 1
                        : deviceInfoDesc.length()) : deviceInfoDesc;
            }

            String noDevices = doc.select("NODeviceID").text();
            String ipRanges = doc.select("IPRange").text();
            String deptName = doc.select("DANWEINAME").text();

            content = deviceInfoDesc + "-" + noDevices + "-" + ipRanges + "-" + deptName;
            policy.setPolicyObject(content);

            // 拼组策略名
            String name = policy.getPolicyName();
            if (policy.getReserved2() > 0) {// 上级策略
                name = name + "上级策略";
                if ((policy.getReserved1() & 8) > 0) {
                    name = name + "-" + "强制策略";
                } else if ((policy.getReserved1() & 16) > 0) {
                    name = name + "-" + "样板模版";
                } else if ((policy.getReserved1() & 32) > 0) {
                    name = name + "-" + "自定义模版";
                }
            } else {// 本机策略
                name = name + "本级策略";
                if ((policy.getReserved1() & 8) > 0) {
                    name = name + "-" + "强制策略";
                } else if ((policy.getReserved1() & 16) > 0) {
                    name = name + "-" + "样板模版";
                } else if ((policy.getReserved1() & 32) > 0) {
                    name = name + "-" + "自定义模版";
                }
            }

            //policy.setPolicyName(name);
        }
        super.decorateSearchResult(page, searchCondition);
    }
}
