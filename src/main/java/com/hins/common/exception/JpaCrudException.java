package com.hins.common.exception;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 14:02
 * @describe： jpa 增删改查异常
 * @version: 1.0
 */

public class JpaCrudException extends RuntimeException {

    public JpaCrudException(String message) {
        super(message);
    }


}
