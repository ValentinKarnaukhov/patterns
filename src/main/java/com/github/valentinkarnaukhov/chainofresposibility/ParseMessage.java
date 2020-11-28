package com.github.valentinkarnaukhov.chainofresposibility;

/**
 * @author Valentin Karnaukhov
 */
public class ParseMessage {

    public static void main(String[] args) {
        String xmlMessage = "<name>This is xml message</name>";
        String jsonMessage = "{\"name\" : \"This is json message\"}";
        String brokenMessage = "This is broken message";

        Handler<Item> messageHandler = new JsonHandler().addNext(new XmlHandler());
        System.out.println(messageHandler.handle(xmlMessage));
        System.out.println(messageHandler.handle(jsonMessage));
        System.out.println(messageHandler.handle(brokenMessage));
    }
}
