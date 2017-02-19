package com.marcus.chiu.web;

/**
 * Created by marcus.chiu on 9/29/16.
 */
public class SpringException extends RuntimeException {
    private String exceptionMessage;

    public SpringException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return this.exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
