package com.springboot.yangmeng.admin.console.exception;


import com.springboot.yangmeng.admin.core.util.PlatformException;

/**
 * 描述: 资源不存在异常
 *
 * @author : xiandafu
 */
public class NoResourceException extends PlatformException {
    public NoResourceException() {
        super();
    }

    public NoResourceException(String message) {
        super(message);
    }
}
