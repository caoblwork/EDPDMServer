/**
 *
 */
package com.vrv.framework.common.utils;

import java.util.HashMap;
import java.util.Map;

import jp.ne.so_net.ga2.no_ji.jcom.IDispatch;
import jp.ne.so_net.ga2.no_ji.jcom.JComException;
import jp.ne.so_net.ga2.no_ji.jcom.ReleaseManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vrv.netmgr.listener.ApplicationListener;

/**
 * 单例加解密工具类
 *
 * @author 曹保利
 *
 */
@SuppressWarnings("unchecked")
public class EdpCryptHelper {

    private static Logger logger = LoggerFactory.getLogger(EdpCryptHelper.class);

    public static final String COM_NAME = "EdpCrypt.TextCrypt";
    public static final String ENCODE_METHOD = "textEncode";
    public static final String DECODE_METHOD = "textDecode";

    /** 系统解密需要的密钥 **/
    private static Long encryptTableKey = 0L;
    /** 内存存放加密表以及该表的加密字段 **/
    private static Map<String, String> encryptTableMetalMap = new HashMap<String, String>();
    /** 单例实例构造初始化加密相关参数 **/
    private static final EdpCryptHelper cryptor = new EdpCryptHelper();

    private EdpCryptHelper() {
        encryptTableKey = (Long) ApplicationListener.getContext().getAttribute("encryptTableKey");
        encryptTableMetalMap = (Map<String, String>) ApplicationListener.getContext().getAttribute("encryptTableMetalMap");
        logger.debug(getClass().getSimpleName() + "		{encryptTableKey:" + encryptTableKey + "} ");
        logger.debug(getClass().getSimpleName() + "		{encryptTableMetalMap:" + encryptTableMetalMap.size() + "} ");
    }

    /**
     * 使用单例模式，返回配置类实例.
     *
     * @return Configuration
     */
    public static EdpCryptHelper getInstance() {
        return cryptor;
    }

    /**
     * 解密
     */
    public String cryptText(String method, String text) {

        logger.debug(getClass().getSimpleName() + "		{comName:" + COM_NAME + ",method:" + method + ",text:" + text + ",encryptTableKey:" + encryptTableKey
                + "}");

        try {
            ReleaseManager rm = new ReleaseManager();
            IDispatch com = new IDispatch(rm, COM_NAME);
            String val = (String) com.method(method, new Object[] { text, String.valueOf(encryptTableKey), false });
            return val;
        } catch (JComException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 判断是否在加密配置中
     *
     * @param tableName
     * @param columnName
     */
    public boolean detecte(String tableName, String columnName) {
        if (encryptTableMetalMap.containsKey(tableName)) {
            String values = encryptTableMetalMap.get(tableName);
            if (values.contains(columnName)) {
                return Boolean.TRUE;
            }
        }
        return false;
    }

}
