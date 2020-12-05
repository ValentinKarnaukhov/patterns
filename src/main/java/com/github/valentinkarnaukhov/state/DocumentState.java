package com.github.valentinkarnaukhov.state;

/**
 * @author Valentin Karnaukhov
 */
public abstract class DocumentState {

    private final Document document;

    public DocumentState(Document document) {
        this.document = document;
    }

    abstract void open();

    abstract void read();

    abstract void write(String extension);

    abstract void close();

    protected Document getDocument() {
        return this.document;
    }

}
