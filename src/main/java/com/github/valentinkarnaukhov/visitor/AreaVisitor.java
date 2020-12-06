package com.github.valentinkarnaukhov.visitor;

/**
 * @author Valentin Karnaukhov
 */
public class AreaVisitor implements Visitor {

    private double area;

    @Override
    public void visitSquare(Square square) {
        area += square.getHeight() ^ 2;
    }

    @Override
    public void visitCircle(Circle circle) {
        area += (circle.getRadius() ^ 2) * Math.PI;
    }

    @Override
    public void print() {
        System.out.println("Area is: " + area);
    }
}
