package com.vrv.framework.dao.mybatis.plugin;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mysql.jdbc.PreparedStatement;
import com.vrv.common.utils.StringUtil;
import com.vrv.framework.common.utils.EdpCryptHelper;
import com.vrv.netmgr.listener.ApplicationListener;

/**
 * (参数加密/结果集解密）的拦截器
 *
 * @author 曹保利
 *
 */
@Intercepts({ @Signature(type = ResultSetHandler.class, method = "handleResultSets", args = { Statement.class }) })
public class DecryptionInterceptor implements Interceptor {

    private Logger logger = LoggerFactory.getLogger(DecryptionInterceptor.class);

    private Properties properties;

    /** 系统解密需要的密钥 **/
    private Long encryptTableKey = null;

    /** 内存存放加密表以及该表的加密字段 **/
    public Map<String, String> encryptTableMetalMap = new HashMap<String, String>();

    @SuppressWarnings("unchecked")
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        logger.debug("----------------------------- start intercept");
        //
        encryptTableKey = (Long) ApplicationListener.getContext().getAttribute("encryptTableKey");
        encryptTableMetalMap = (Map<String, String>) ApplicationListener.getContext().getAttribute("encryptTableMetalMap");
        //
        Object[] args = invocation.getArgs();
        Statement statement = (Statement) args[0];
        ResultSet rs = statement.getResultSet();
        int columnCount = rs.getMetaData().getColumnCount();
        //
        for (int i = 1; i <= columnCount; i++) {
            String tableName = rs.getMetaData().getTableName(i);
            String columnName = rs.getMetaData().getColumnName(i);
            logger.debug("columnName:" + columnName + " , tableName:" + tableName);

            if (detecte(tableName, columnName)) {
                rs.beforeFirst();
                while (rs.next()) {
                    String text = rs.getString(i);
                    if (!StringUtil.isValidString(text)) {
                        continue;
                    }
                    String value = EdpCryptHelper.cryptText(EdpCryptHelper.DECODE_METHOD, text, String.valueOf(encryptTableKey));
                    // rs.updateString(i, value);
                    rs.updateRow();
                }
            }
        }
        logger.debug("----------------------------- end   intercept");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * 判断是否在加密配置中
     *
     * @param tableName
     * @param columnName
     */
    private boolean detecte(String tableName, String columnName) {
        if (encryptTableMetalMap.containsKey(tableName)) {
            String values = encryptTableMetalMap.get(tableName);
            if (values.contains(columnName)) {
                logger.debug(tableName + "表的" + columnName + "字段需要解密！");
                return Boolean.TRUE;
            }
        }
        return false;
    }

}
