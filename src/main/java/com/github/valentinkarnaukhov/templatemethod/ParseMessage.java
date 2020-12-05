package com.github.valentinkarnaukhov.templatemethod;

/**
 * @author Valentin Karnaukhov
 */
public class ParseMessage {

    public static void main(String[] args) {
        String xmlMessage = "<name>XML lover</name>";
        String jsonMessage = "{\"name\" : \"JSON lover\"}";

        Parser xmlParser = new XmlParser();
        Parser jsonParser = new JsonParser();

        xmlParser.parse(xmlMessage);
        jsonParser.parse(jsonMessage);
    }
}
