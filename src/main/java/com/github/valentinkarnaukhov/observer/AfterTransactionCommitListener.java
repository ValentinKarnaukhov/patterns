package com.github.valentinkarnaukhov.observer;

/**
 * @author Valentin Karnaukhov
 */
public class AfterTransactionCommitListener implements EventListener {
    @Override
    public void update(EventType eventType) {
        System.out.println("***I saw end of world...***");
    }
}
