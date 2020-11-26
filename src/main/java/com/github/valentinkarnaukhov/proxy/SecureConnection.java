package com.github.valentinkarnaukhov.proxy;

/**
 * @author Valentin Karnaukhov
 */
public interface SecureConnection {

    void open();

    void close();

    void transfer(String data);

    boolean isExpired();
}
