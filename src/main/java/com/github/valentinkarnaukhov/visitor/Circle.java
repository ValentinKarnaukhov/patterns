package com.github.valentinkarnaukhov.visitor;

/**
 * @author Valentin Karnaukhov
 */
public class Circle implements Node {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
