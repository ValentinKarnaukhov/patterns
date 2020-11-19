package com.github.valentinkarnaukhov.brige;

/**
 * @author Valentin Karnaukhov
 */
public class BasicApi implements Api {

    private final Protocol protocol;

    public BasicApi(Protocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public void get() {
        do {
            protocol.openConnection();
            String data = protocol.fetchData();
            System.out.println(data + " was received");
            protocol.closeConnection();
        } while (!protocol.isDelivered());
    }

    @Override
    public void post(String data) {
        do {
            protocol.openConnection();
            System.out.println(data + " was sent");
            String response = protocol.sendData(data);
            System.out.println(response + " was received");
            protocol.closeConnection();
        } while (!protocol.isDelivered());
    }

    @Override
    public void delete() {
        do {
            protocol.openConnection();
            String data = protocol.fetchData();
            System.out.println(data + " was deleted");
            protocol.closeConnection();
        } while (!protocol.isDelivered());
    }

    @Override
    public void put(String data) {
        do {
            protocol.openConnection();
            System.out.println(data + " was putted");
            String response = protocol.sendData(data);
            System.out.println(response + " was received");
            protocol.closeConnection();
        } while (!protocol.isDelivered());
    }
}
