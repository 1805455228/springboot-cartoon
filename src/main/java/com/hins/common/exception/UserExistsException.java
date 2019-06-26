package com.hins.common.exception;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 15:49
 * @describe： 用户不存在异常
 * @version: 1.0
 */
public class UserExistsException extends RuntimeException {

    public UserExistsException(String message) {
        super(message);
    }

}
