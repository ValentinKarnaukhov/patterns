package com.github.valentinkarnaukhov.builder;

/**
 * @author Valentin Karnaukhov
 */
public class PizzaDishBuilder implements PizzaBuilder {

    private final PizzaDish pizzaDish = new PizzaDish();

    public void setCheese(String cheese) {
        pizzaDish.extendDescription("With cheese " + cheese + "\n");
    }

    public void setFilling(String filling) {
        pizzaDish.extendDescription("With filling " + filling + "\n");
    }

    public void setDough(String dough) {
        pizzaDish.extendDescription("With dough " + dough + "\n");
    }

    public PizzaDish build(){
        return this.pizzaDish;
    }
}
