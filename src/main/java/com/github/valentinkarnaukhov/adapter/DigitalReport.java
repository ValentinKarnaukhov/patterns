package com.github.valentinkarnaukhov.adapter;

import java.util.List;

/**
 * @author Valentin Karnaukhov
 */
public class DigitalReport {

    private final List<String> content;

    public DigitalReport(List<String> content) {
        this.content = content;
    }

    public List<String> getContent() {
        return content;
    }
}
