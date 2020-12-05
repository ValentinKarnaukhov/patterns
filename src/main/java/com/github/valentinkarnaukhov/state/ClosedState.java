package com.github.valentinkarnaukhov.state;

/**
 * @author Valentin Karnaukhov
 */
public class ClosedState extends DocumentState {

    public ClosedState(Document document) {
        super(document);
        super.getDocument().isOpen = false;
    }

    @Override
    void open() {
        super.getDocument().setState(new OpenedState(super.getDocument()));
    }

    @Override
    void read() {
        System.out.println("Document is closed");
    }

    @Override
    void write(String extension) {
        System.out.println("Document is closed");
    }

    @Override
    void close() {
        //do nothing
        System.out.println("Already closed");
    }
}
