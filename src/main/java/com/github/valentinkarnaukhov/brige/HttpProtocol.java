package com.github.valentinkarnaukhov.brige;

import java.util.Random;

/**
 * @author Valentin Karnaukhov
 */
public class HttpProtocol implements Protocol {

    private String data;

    @Override
    public void openConnection() {
        data = "HTTP";
        System.out.println("Connection was opened");
    }

    @Override
    public void closeConnection() {
        data = null;
        System.out.println("Connection was closed");
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
