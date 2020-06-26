package com.atguigu.crowd.util.exception;

/**
 * @program: atcrowdfunding05-common-util
 * @description 保存或者更新时候检测到账号不唯一的异常
 * @author: swq
 * @create: 2020-06-26 22:14
 **/
public class LoginAcctNotUniqueException  extends RuntimeException{
    public LoginAcctNotUniqueException() {
    }

    public LoginAcctNotUniqueException(String message) {
        super(message);
    }

    public LoginAcctNotUniqueException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginAcctNotUniqueException(Throwable cause) {
        super(cause);
    }

    public LoginAcctNotUniqueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
