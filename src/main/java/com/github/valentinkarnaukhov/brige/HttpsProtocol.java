package com.github.valentinkarnaukhov.brige;

import java.util.Random;

/**
 * @author Valentin Karnaukhov
 */
public class HttpsProtocol implements Protocol {

    private String data;

    @Override
    public void openConnection() {
        data = "HTTPS";
        System.out.println("Secure connection was opened");
    }

    @Override
    public void closeConnection() {
        data = null;
        System.out.println("Secure Connection was closed");
    }

    @Override
    public boolean isDelivered() {
        return true;
    }

    @Override
    public String sendData(String data) {
        return this.data = data;
    }

    @Override
    public String fetchData() {
        return data;
    }

}
