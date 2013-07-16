package com.vrv.netmgr.listener;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.vrv.common.Constants;
import com.vrv.common.config.Configuration;
import com.vrv.framework.common.utils.SpringContextHolder;

/**
 * 获取加密相关信息的全局监听器
 *
 * @author 曹保利
 *
 */
public class ApplicationListener implements ServletContextListener {

    Logger logger = LoggerFactory.getLogger(getClass());

    /** 全局的application **/
    private static ServletContext context = null;

    /** 系统解密需要的密钥 **/
    private Long encryptTableKey = null;

    /** 内存存放加密表以及该表的加密字段 **/
    public Map<String, String> encryptTableMetalMap = new HashMap<String, String>();

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        context = null;
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        context = servletContextEvent.getServletContext();

        logger.debug("...... 开始加载加密数据 ......");

        setEncryptTableKey();
        setEncryptTableMetalMap();

        logger.debug("...... 加密数据加载完成 ......");
    }

    /**
     * @param jdbcTemplate
     */
    private void setEncryptTableMetalMap() {
        JdbcTemplate jdbcTemplate = SpringContextHolder.getBean("jdbcTemplate");
        jdbcTemplate.query(Configuration.getInstance().getValue(Constants.ENCRYPT_TABLE_AND_FIELDS_SQL), new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                String key = rs.getString(Configuration.getInstance().getValue(Constants.ENCRYPT_TABLE_NAME));
                String val = rs.getString(Configuration.getInstance().getValue(Constants.ENCRYPT_TABLE_VALUE));
                encryptTableMetalMap.put(key, val);
                return null;
            }
        });

        context.setAttribute("encryptTableMetalMap", encryptTableMetalMap);
    }

    /**
     * 获取密钥并将其存入全局的Context
     *
     * @param jdbcTemplate
     */
    private void setEncryptTableKey() {
        JdbcTemplate jdbcTemplate = SpringContextHolder.getBean("jdbcTemplate");
        jdbcTemplate.query(Configuration.getInstance().getValue(Constants.ENCRYPT_TABLE_KEY_SQL), new RowMapper<Long>() {
            @Override
            public Long mapRow(ResultSet rs, int rowNum) throws SQLException {
                encryptTableKey = rs.getLong(Configuration.getInstance().getValue(Constants.CFG_VALUE));
                return encryptTableKey;
            }
        });

        context.setAttribute("encryptTableKey", encryptTableKey);
    }

    public static ServletContext getContext() {
        return context;
    }
}
