package com.github.valentinkarnaukhov.brige;

/**
 * @author Valentin Karnaukhov
 */
public interface Protocol {

    void openConnection();
    void closeConnection();
    boolean isDelivered();
    String sendData(String data);
    String fetchData();

}
