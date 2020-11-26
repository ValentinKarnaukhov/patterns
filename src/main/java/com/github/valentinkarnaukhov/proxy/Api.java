package com.github.valentinkarnaukhov.proxy;

/**
 * @author Valentin Karnaukhov
 */
public class Api {

    public static void main(String[] args) throws InterruptedException {
        SecureConnection connection = new Oauth2SecureConnection();
        SecureConnection stateConnection = new StateSecureConnection(new Oauth2SecureConnection());

        connection.transfer("Kitties");
        connection.transfer("Kitties");

        stateConnection.transfer("Puppies");
        stateConnection.transfer("Puppies");
    }
}
