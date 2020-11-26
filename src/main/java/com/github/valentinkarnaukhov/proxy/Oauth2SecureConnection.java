package com.github.valentinkarnaukhov.proxy;

import java.time.LocalDateTime;
import java.util.Random;

import static java.time.temporal.ChronoUnit.MILLIS;

/**
 * @author Valentin Karnaukhov
 */
public class Oauth2SecureConnection implements SecureConnection {

    private String token;
    private LocalDateTime expiredAt;

    @Override
    public void open() {
        System.out.println("Opening connection...");
        refreshToken();
        System.out.println("Connection was opened");
    }

    @Override
    public void close() {
        System.out.println("Closing connection...");
        token = null;
        expiredAt = LocalDateTime.now();
        System.out.println("Connection was closed");
    }

    @Override
    public void transfer(String data) {
        open();
        System.out.println("Transferring <" + data + ">");
        close();
    }

    @Override
    public boolean isExpired() {
        return expiredAt == null || expiredAt.isBefore(LocalDateTime.now());
    }

    private void refreshToken() {
        System.out.println("Refreshing token...");
        token = String.valueOf(new Random().nextInt(1000000000));
        expiredAt = LocalDateTime.now().plus(500, MILLIS);
        System.out.println("New token is <" + token + "> expires at <" + expiredAt + ">");
    }


}
