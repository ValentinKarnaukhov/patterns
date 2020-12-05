package com.github.valentinkarnaukhov.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Valentin Karnaukhov
 */
public class EventManager {

    private final Map<EventListener.EventType, Set<EventListener>> listeners = new HashMap<>();

    public EventManager() {
        for (EventListener.EventType type : EventListener.EventType.values()) {
            listeners.put(type, new HashSet<>());
        }
    }

    public void subscribe(EventListener.EventType eventType, EventListener eventListener) {
        this.listeners.get(eventType).add(eventListener);
    }

    public void unsubscribe(EventListener.EventType type, EventListener eventListener) {
        this.listeners.get(type).remove(eventListener);
    }

    public void notifyListeners(EventListener.EventType eventType) {
        this.listeners.get(eventType).forEach(l -> l.update(eventType));
    }

}
