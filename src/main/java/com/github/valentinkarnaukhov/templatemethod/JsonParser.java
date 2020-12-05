package com.github.valentinkarnaukhov.templatemethod;

/**
 * @author Valentin Karnaukhov
 */
public class JsonParser extends Parser {
    @Override
    protected String extractData(String rawData) {
        return rawData.replaceAll("\\{\"name\" : \"", "").replaceFirst("\"}", "");
    }

    @Override
    protected String processData(String data) {
        return "Hello " + data + ", json is so popular";
    }
}
