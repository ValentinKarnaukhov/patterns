package com.github.valentinkarnaukhov.brige;

/**
 * @author Valentin Karnaukhov
 */
public interface Api {

    void get();

    void post(String data);

    void delete();

    void put(String data);

}
