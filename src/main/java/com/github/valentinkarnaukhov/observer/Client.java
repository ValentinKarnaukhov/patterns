package com.github.valentinkarnaukhov.observer;

/**
 * @author Valentin Karnaukhov
 */
public class Client {

    public static void main(String[] args) {
        NotifierListener notifierListener = new NotifierListener();
        AfterTransactionCommitListener afterTransactionCommitListener = new AfterTransactionCommitListener();

        EventManager eventManager = new EventManager();
        eventManager.subscribe(EventListener.EventType.OTHER, notifierListener);
        eventManager.subscribe(EventListener.EventType.COMMIT, afterTransactionCommitListener);

        Runnable action = () -> {
            ImportantBusynessClass importantBusynessClass = new ImportantBusynessClass(eventManager);
            int ops = 10;
            while (ops-- != 0) {
                importantBusynessClass.doNotSuchImportantOperation();
                importantBusynessClass.doOperationWithDatabase();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(action);
        thread.start();
    }
}
