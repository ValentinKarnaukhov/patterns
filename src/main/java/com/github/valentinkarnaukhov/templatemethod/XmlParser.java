package com.github.valentinkarnaukhov.templatemethod;

/**
 * @author Valentin Karnaukhov
 */
public class XmlParser extends Parser {
    @Override
    protected String extractData(String rawData) {
        return rawData.replaceAll("<name>|</name>", "");
    }

    @Override
    protected String processData(String data) {
        return "Hello " + data + ", xml and maven are best friends";
    }
}
