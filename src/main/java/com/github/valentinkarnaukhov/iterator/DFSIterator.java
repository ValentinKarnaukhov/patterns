package com.github.valentinkarnaukhov.iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Valentin Karnaukhov
 */
public class DFSIterator implements Iterator<Node> {

    private final Stack<Node> stack = new Stack<>();

    public DFSIterator(Node head) {
        stack.add(head);
    }

    @Override
    public boolean hasNext() {
        return stack.size() != 0;
    }

    @Override
    public Node next() {
        Node next = stack.pop();
        for (int i = next.getChildren().size()-1; i >= 0; i--) {
            stack.add(next.getChildren().get(i));
        }
        return next;
    }
}
