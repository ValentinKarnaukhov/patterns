package com.github.valentinkarnaukhov.observer;

/**
 * @author Valentin Karnaukhov
 */
public interface EventListener {

    void update(EventType eventType);

    enum EventType{
        COMMIT,
        OTHER
    }

}
