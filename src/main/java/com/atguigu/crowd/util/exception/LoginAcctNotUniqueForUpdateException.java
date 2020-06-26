package com.atguigu.crowd.util.exception;

/**
 * @program: atcrowdfunding05-common-util
 * @description //TODO
 * @author: swq
 * @create: 2020-06-27 00:12
 **/
public class LoginAcctNotUniqueForUpdateException extends RuntimeException {
    public LoginAcctNotUniqueForUpdateException() {
    }

    public LoginAcctNotUniqueForUpdateException(String message) {
        super(message);
    }

    public LoginAcctNotUniqueForUpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginAcctNotUniqueForUpdateException(Throwable cause) {
        super(cause);
    }

    public LoginAcctNotUniqueForUpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
