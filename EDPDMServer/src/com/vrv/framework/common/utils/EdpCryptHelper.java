/**
 *
 */
package com.vrv.framework.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.ne.so_net.ga2.no_ji.jcom.IDispatch;
import jp.ne.so_net.ga2.no_ji.jcom.JComException;
import jp.ne.so_net.ga2.no_ji.jcom.ReleaseManager;

/**
 * @author caobl
 *
 */
public class EdpCryptHelper {

    private static Logger logger = LoggerFactory.getLogger(EdpCryptHelper.class);

    public static final String comName = "EdpCrypt.TextCrypt";
    public static final String ENCODE_METHOD = "textEncode";
    public static final String DECODE_METHOD = "textDecode";

    public static void main(String[] args) {

        cryptText(EdpCryptHelper.ENCODE_METHOD, "S#f'Cff", "588578");
        cryptText(EdpCryptHelper.DECODE_METHOD, "S#f'Cff", "588578");

    }

    /**
     * 解密
     */
    public static String cryptText(String method, String text, String key) {
        ReleaseManager rm = new ReleaseManager();
        IDispatch com;
        try {
            com = new IDispatch(rm, comName);
            Object[] params = new Object[] { text, key, false };
            String val = ((String) com.method(method, params));
            return val;
        } catch (JComException e) {
            e.printStackTrace();
        }
        return null;
    }

}
