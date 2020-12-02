package com.github.valentinkarnaukhov.mediator;

/**
 * @author Valentin Karnaukhov
 */
public interface Mediator {

    void notify(Object sender, String event);
}
