package com.github.valentinkarnaukhov.visitor;

/**
 * @author Valentin Karnaukhov
 */
public class Square implements Node {

    private final int height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSquare(this);
    }

    public int getHeight() {
        return height;
    }
}
