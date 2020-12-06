package com.github.valentinkarnaukhov.visitor;

/**
 * @author Valentin Karnaukhov
 */
public interface Node {

    void accept(Visitor visitor);
}
