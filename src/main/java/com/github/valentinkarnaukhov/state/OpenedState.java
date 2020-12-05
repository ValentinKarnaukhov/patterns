package com.github.valentinkarnaukhov.state;

/**
 * @author Valentin Karnaukhov
 */
public class OpenedState extends DocumentState {

    public OpenedState(Document document) {
        super(document);
        super.getDocument().isOpen = true;
    }

    @Override
    void open() {
        //do nothing
        System.out.println("Already opened");
    }

    @Override
    void read() {
        System.out.println(super.getDocument().getContent());
    }

    @Override
    void write(String extension) {
        super.getDocument().extendContent(extension);
    }

    @Override
    void close() {
        super.getDocument().setState(new ClosedState(super.getDocument()));
    }
}
