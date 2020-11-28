package com.github.valentinkarnaukhov.chainofresposibility;

/**
 * @author Valentin Karnaukhov
 */
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
