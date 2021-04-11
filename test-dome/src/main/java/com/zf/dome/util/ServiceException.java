package com.zf.dome.util;

/**
 * @author: 钟凡
 * @program: spring-cloud-dome
 * @description: 自定义接口异常处理
 * @company—date:  2021-03-30 21:00
 **/
public class ServiceException extends Exception {

    public ServiceException() {
        super();
    }
    public ServiceException(String message){
        super(message);
    }
    public ServiceException(Throwable throwable){
        super(throwable);
    }
    public ServiceException(String message ,Throwable throwable){
        super(message, throwable);
    }
}
