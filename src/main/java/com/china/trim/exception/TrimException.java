package com.china.trim.exception;

public class TrimException extends Exception{
    String errCode;
    String errMsg;
    public TrimException(){
        super();
    }
    public TrimException(String errMsg){
        super(errMsg);
        this.errMsg=errMsg;
    }
    public TrimException(String errCode,String errMsg){
        super();
        this.errCode=errCode;
        this.errMsg=errMsg;
    }
    public String getErrCode(){
        return this.errCode;
    }
    public String getErrMsg(){
        return this.errMsg;
    }
}
