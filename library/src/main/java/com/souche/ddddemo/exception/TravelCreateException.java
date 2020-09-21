package com.souche.ddddemo.exception;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/21
 */
public class TravelCreateException extends RuntimeException {
    private static final long serialVersionUID = -3953525122653063566L;

    public TravelCreateException(String message) {
        super(message);
    }
}
