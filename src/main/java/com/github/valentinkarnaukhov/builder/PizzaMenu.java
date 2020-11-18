package com.github.valentinkarnaukhov.builder;

/**
 * @author Valentin Karnaukhov
 */
public class PizzaMenu {

    private String description;

    public PizzaMenu() {
        this.description = "";
    }

    public void extendDescription(String s) {
        this.description += s;
    }

    public void show() {
        System.out.println(this.description);
    }
}
