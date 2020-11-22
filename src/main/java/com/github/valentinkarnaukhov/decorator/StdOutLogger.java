package com.github.valentinkarnaukhov.decorator;

/**
 * @author Valentin Karnaukhov
 */
public class StdOutLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
