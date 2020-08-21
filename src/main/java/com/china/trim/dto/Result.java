package com.china.trim.dto;

import java.util.List;

/**
 * 返回结果类
 *
 * @author wzryzhw
 * @param <T>
 */
public class Result<T> {
    private String rtnCode;
    private String rtnMsg;
    private T bean;
    private List<T> beans;
    public Result(){

    }
    public Result(String rtnCode,String rtnMsg){
        this.rtnCode=rtnCode;
        this.rtnMsg=rtnMsg;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    public T getBean() {
        return bean;
    }

    public void setBean(T bean) {
        this.bean = bean;
    }

    public List<T> getBeans() {
        return beans;
    }

    public void setBeans(List<T> beans) {
        this.beans = beans;
    }
}
