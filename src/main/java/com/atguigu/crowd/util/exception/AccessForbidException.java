package com.atguigu.crowd.util.exception;

/**
 * @program: atcrowdfunding05-common-util
 * @description //TODO
 * @author: swq
 * @create: 2020-05-06 22:17
 **/
public class AccessForbidException extends RuntimeException{
    public AccessForbidException() {
    }

    public AccessForbidException(String message) {
        super(message);
    }

    public AccessForbidException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessForbidException(Throwable cause) {
        super(cause);
    }

    public AccessForbidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
