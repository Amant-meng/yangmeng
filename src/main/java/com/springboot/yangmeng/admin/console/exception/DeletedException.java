package com.springboot.yangmeng.admin.console.exception;


import com.springboot.yangmeng.admin.core.util.PlatformException;

/**
 * 描述:  已删除异常
 *
 * @author : xiandafu
 */
public class DeletedException extends PlatformException {
    public DeletedException() {
        super();
    }

    public DeletedException(String message) {
        super(message);
    }
}
