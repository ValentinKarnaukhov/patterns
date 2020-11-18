package com.github.valentinkarnaukhov.adapter;

/**
 * @author Valentin Karnaukhov
 */
public class PaperReport {

    private String content;

    public PaperReport() {
        this.content = "Blank";
    }

    public PaperReport(String content) {
        this.content = content;
    }


    public String getContent() {
        return content;
    }
}
