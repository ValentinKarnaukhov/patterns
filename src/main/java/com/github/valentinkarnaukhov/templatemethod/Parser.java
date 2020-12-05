package com.github.valentinkarnaukhov.templatemethod;

/**
 * @author Valentin Karnaukhov
 */
public abstract class Parser {

    public final void parse(String rawData) {
        String data = extractData(rawData);
        String processedData = processData(data);
        displayData(processedData);
    }

    protected abstract String extractData(String rawData);

    protected abstract String processData(String data);

    protected void displayData(String data) {
        System.out.println(data);
    }

}
