package com.github.valentinkarnaukhov.chainofresposibility;

/**
 * @author Valentin Karnaukhov
 */
public abstract class Handler<T> {

    private Handler<T> next;

    abstract T handle(String body);

    public Handler<T> addNext(Handler<T> next) {
        this.next = next;
        return this;
    }

    protected T handleNext(String body) {
        if (next == null) {
            throw new RuntimeException("Can't find suitable handler for: " + body);
        }
        return next.handle(body);
    }

}
