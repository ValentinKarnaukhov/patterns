package com.github.valentinkarnaukhov.builder;

/**
 * @author Valentin Karnaukhov
 */
public class PizzaDish {

    private String description;

    public PizzaDish() {
        this.description = "";
    }

    public void extendDescription(String s) {
        this.description += s;
    }

    public void show(){
        System.out.println(this.description);
    }

}
