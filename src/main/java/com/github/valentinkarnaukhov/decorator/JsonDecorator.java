package com.github.valentinkarnaukhov.decorator;

/**
 * @author Valentin Karnaukhov
 */
public class JsonDecorator implements Logger {

    private Logger wrappee;

    public JsonDecorator(Logger wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void log(String message) {
        wrappee.log(asJson(message));
    }

    private String asJson(String message) {
        return "{ \"message\":\"" + message + "\" }";
    }

}
