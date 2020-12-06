package com.github.valentinkarnaukhov.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Valentin Karnaukhov
 */
public class Geometry {

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        for (int i : IntStream.range(1, 10).toArray()) {
            nodes.add(new Circle(i));
            nodes.add(new Square(i));
        }
        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        nodes.stream()
                .peek(node -> node.accept(areaVisitor))
                .forEach(node -> node.accept(perimeterVisitor));
        areaVisitor.print();
        perimeterVisitor.print();
    }
}
