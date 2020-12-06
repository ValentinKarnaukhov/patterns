package com.github.valentinkarnaukhov.visitor;

/**
 * @author Valentin Karnaukhov
 */
public class PerimeterVisitor implements Visitor {

    private double perimeter;

    @Override
    public void visitSquare(Square square) {
        perimeter += 4 * square.getHeight();
    }

    @Override
    public void visitCircle(Circle circle) {
        perimeter += 2 * circle.getRadius() * Math.PI;
    }

    @Override
    public void print() {
        System.out.println("Perimeter is: " + perimeter);
    }
}
