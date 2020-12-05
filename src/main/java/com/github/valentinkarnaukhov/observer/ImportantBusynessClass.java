package com.github.valentinkarnaukhov.observer;

/**
 * @author Valentin Karnaukhov
 */
public class ImportantBusynessClass {

    private final EventManager eventManager;

    public ImportantBusynessClass(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void doOperationWithDatabase() {
        System.out.println("VERY IMPORTANT OPERATION");
        eventManager.notifyListeners(EventListener.EventType.COMMIT);
    }

    public void doNotSuchImportantOperation(){
        System.out.println("NOT SUCH IMPORTANT OPERATION");
        eventManager.notifyListeners(EventListener.EventType.OTHER);
    }
}
