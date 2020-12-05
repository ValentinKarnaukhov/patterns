package com.github.valentinkarnaukhov.observer;

/**
 * @author Valentin Karnaukhov
 */
public class NotifierListener implements EventListener {
    @Override
    public void update(EventType eventType) {
        System.out.println("***I'll notify all***");
    }
}
