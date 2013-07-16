package com.vrv.netmgr.vo;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.vrv.common.utils.StringUtil;

/**
 * 解析策略对象<br/>
 * <DeviceID>12,9</DeviceID><NODeviceID></NODeviceID><IPRange></IPRange><
 * NOIPRange>192.168.0.33</NOIPRange>
 *
 * @author 曹保利
 *
 */
public class PolicyObject extends DefaultHandler {
	/**
	 * 日志处理对象
	 */
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 按设备
	 */
	private List<String> devices = new ArrayList<String>();
	/**
	 * 排除的设备
	 */
	private List<String> noDevices = new ArrayList<String>();
	/**
	 * 按ip区域
	 */
	private List<String> ipRanges = new ArrayList<String>();

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("DeviceID")) {
			String val = attributes.getValue(qName);
			if (StringUtil.isValidString(val)) {
				String[] array = val.split(",");
				devices = Arrays.asList(array);
			}
			logger.info("*****************DeviceID:" + val);
		}
	}

	public static void parser(String content, DefaultHandler handler) {
		SAXParserFactory saxfac = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = saxfac.newSAXParser();
			saxParser.parse(new ByteArrayInputStream(content.getBytes()), handler);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<String> getDevices() {
		return devices;
	}

	public void setDevices(List<String> devices) {
		this.devices = devices;
	}

	public List<String> getNoDevices() {
		return noDevices;
	}

	public void setNoDevices(List<String> noDevices) {
		this.noDevices = noDevices;
	}

	public List<String> getIpRanges() {
		return ipRanges;
	}

	public void setIpRanges(List<String> ipRanges) {
		this.ipRanges = ipRanges;
	}

}
