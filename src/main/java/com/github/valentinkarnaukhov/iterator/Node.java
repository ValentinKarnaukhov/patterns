package com.github.valentinkarnaukhov.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author Valentin Karnaukhov
 */
public class Node implements Iterable<Node> {

    private final List<Node> children = new ArrayList<>();
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public void addChildren(Node node) {
        this.children.add(node);
    }

    @Override
    public Iterator<Node> iterator() {
        return new DFSIterator(this);
    }

    @Override
    public void forEach(Consumer<? super Node> action) {

    }

    @Override
    public Spliterator<Node> spliterator() {
        return null;
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
