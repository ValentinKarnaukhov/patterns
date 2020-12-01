package com.github.valentinkarnaukhov.iterator;

import java.util.Iterator;

/**
 * @author Valentin Karnaukhov
 */
public class IteratorPattern {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        n1.addChildren(n2);
        n1.addChildren(n7);
        n1.addChildren(n8);

        n2.addChildren(n3);
        n2.addChildren(n6);

        n3.addChildren(n4);
        n3.addChildren(n5);

        n8.addChildren(n9);
        n8.addChildren(n12);

        n9.addChildren(n10);
        n9.addChildren(n11);
        Iterator<Node> iterator = n1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
