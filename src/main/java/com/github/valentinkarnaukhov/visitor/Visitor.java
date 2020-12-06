package com.github.valentinkarnaukhov.visitor;

/**
 * @author Valentin Karnaukhov
 */
public interface Visitor {

    void visitSquare(Square square);

    void visitCircle(Circle circle);

    void print();

}
