package com.github.valentinkarnaukhov.proxy;

/**
 * @author Valentin Karnaukhov
 */
public class StateSecureConnection implements SecureConnection {

    private final SecureConnection secureConnection;

    public StateSecureConnection(SecureConnection secureConnection) {
        this.secureConnection = secureConnection;
    }

    @Override
    public void open() {
        if (isExpired()) {
            secureConnection.open();
        }
    }

    @Override
    public void close() {
        secureConnection.close();
    }

    @Override
    public void transfer(String data) {
        this.open();
        System.out.println("Transferring <" + data + ">");
    }

    @Override
    public boolean isExpired() {
        return secureConnection.isExpired();
    }
}
