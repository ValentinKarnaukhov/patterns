package com.github.valentinkarnaukhov.state;

/**
 * @author Valentin Karnaukhov
 */
public class Reader {

    public static void main(String[] args) {
        Document document = new Document();

        document.open();
        document.read();
        document.write("Hello");
        document.write("_world!");
        document.read();
        document.close();
        document.close();
        document.read();
        document.write("text");
    }
}
