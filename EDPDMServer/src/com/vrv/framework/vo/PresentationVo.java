package com.vrv.framework.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 页面显示用VO
 *
 * @author 曹保利
 * @version 1.0
 *
 */
public class PresentationVo implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1811940397727188284L;

    /**
     * 处理是否成功
     */
    private boolean success = Boolean.TRUE;

    /**
     * 消息集合
     */
    private Messages messages = new Messages();

    /**
     * 总记录数
     */
    private Long totalRecords = 0L;

    /**
     * 记录集合
     */
    private List<Object> records;

    /**
     * 单记录数据对象
     */
    private Object record;

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success
     *            the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * @return the totalRecords
     */
    public Long getTotalRecords() {
        return totalRecords;
    }

    /**
     * @param totalRecords
     *            the totalRecords to set
     */
    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    /**
     * @return the records
     */
    public List<Object> getRecords() {
        return records;
    }

    /**
     * @param records
     *            the records to set
     */
    public void setRecords(List<Object> records) {
        this.records = records;
    }

    /**
     * @return the record
     */
    public Object getRecord() {
        return record;
    }

    /**
     * @param record
     *            the record to set
     */
    public void setRecord(Object record) {
        this.record = record;
    }

    public List<String> getMessages() {
        return messages.getMessages();
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

}
