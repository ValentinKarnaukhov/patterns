package com.github.valentinkarnaukhov.decorator;

/**
 * @author Valentin Karnaukhov
 */
public class SizeLimitDecorator implements Logger {

    private Logger wrappee;
    private int maxLength = 1024;

    public SizeLimitDecorator(Logger wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void log(String message) {
        wrappee.log(trim(message));
    }

    private String trim(String message) {
        return message.substring(0, maxLength);
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
