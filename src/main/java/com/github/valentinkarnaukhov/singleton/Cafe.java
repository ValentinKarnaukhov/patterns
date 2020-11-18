package com.github.valentinkarnaukhov.singleton;

/**
 * @author Valentin Karnaukhov
 */
public class Cafe {


    public static void main(String[] args) {
        Toilet.getInstance();
        Toilet.getInstance();

        Toilet.getInstance().use("Visitor1");
        Toilet.getInstance().use("Visitor2");
        Toilet.getInstance().use("Visitor3");
    }
}
