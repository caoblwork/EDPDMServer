package com.vrv.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

/**
 *
 * IP地址工具类
 *
 * @author 曹保利
 *
 */
public class IpUtil {

    /**
     * 从request中获取IP地址
     *
     * @param request
     * @return
     */
    public static String getRemoteIP(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip.split(",").length > 0) {
            ip = ip.split(",")[0];
        }
        return ip;
    }

    // 计算出掩码指定的IP地址个数 如: 24
    public static long ipCount(int mask) {
        long number = 0;
        for (int i = 0; i < 32 - mask; i++) {
            number += Math.pow(2, i);
        }
        return number;
    }

    // 分割IP地址
    public static long[] splitIp(String ip) {
        long[] ipArray = new long[4];
        int position1 = ip.indexOf(".");
        int length = ip.length();
        if (length >= 7 && length < 16) {
            if (position1 > 0) {
                int position2 = ip.indexOf(".", position1 + 1);
                if (position2 > 0) {
                    int position3 = ip.indexOf(".", position2 + 1);
                    if (position3 > 0 && position3 < length - 1) {
                        try {
                            ipArray[0] = Long.parseLong(ip.substring(0, position1));
                            ipArray[1] = Long.parseLong(ip.substring(position1 + 1, position2));
                            ipArray[2] = Long.parseLong(ip.substring(position2 + 1, position3));
                            ipArray[3] = Long.parseLong(ip.substring(position3 + 1));
                        } catch (NumberFormatException e) {
                            return null;
                        }
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
        return ipArray;
    }

    /**
     * 将10.0.0.0形式的ip地址转换成10进制整数
     *
     * @param str
     * @return
     */
    public static long ipToLong(String str) {
        long[] ip = splitIp(str);
        if (ip != null) {
            // ip=*256*256*256+ip2*256*256+ip3*256+ip4
            return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
        } else {
            return 0;
        }
    }

    // 将10.0.0.0形式的掩码地址转换成10进制整数
    public static long maskToLong(int mask) {
        long longMask = 0;
        for (int i = 31; i >= 32 - mask; i--) {
            longMask += Math.pow(2, i);
        }
        return longMask;
    }

    // 将10进制整数形式转换成127.0.0.1形式的IP地址
    public static String longToIP(long longIp) {
        StringBuffer sb = new StringBuffer("");
        sb.append(String.valueOf(longIp >>> 24));// 右移24位
        sb.append(".");
        sb.append(String.valueOf((longIp & 0x00FFFFFF) >>> 16)); // 将高8位置0，然后右移16位
        sb.append(".");
        sb.append(String.valueOf((longIp & 0x0000FFFF) >>> 8));
        sb.append(".");
        sb.append(String.valueOf(longIp & 0x000000FF));
        return sb.toString();
    }

}
