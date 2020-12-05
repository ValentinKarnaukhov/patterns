package com.github.valentinkarnaukhov.state;

/**
 * @author Valentin Karnaukhov
 */
public class Document {

    protected boolean isOpen = false;

    private String content = "";
    private DocumentState state;

    public Document() {
        this.state = new ClosedState(this);
    }

    public void open() {
        this.state.open();
    }

    public void read() {
        this.state.read();
    }

    public void write(String text) {
        this.state.write(text);
    }

    public void close() {
        this.state.close();
    }

    public void extendContent(String extension) {
        content += extension;
    }

    public String getContent() {
        return content;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }
}
