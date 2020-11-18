package com.github.valentinkarnaukhov.builder;

/**
 * @author Valentin Karnaukhov
 */
public class PizzaMenuBuilder implements PizzaBuilder {

    private final PizzaMenu pizzaMenu = new PizzaMenu();

    public void setCheese(String cheese) {
        pizzaMenu.extendDescription(cheese+" is so fat\n");
    }

    public void setFilling(String filling) {
        pizzaMenu.extendDescription(filling+" is so fat\n");
    }

    public void setDough(String dough) {
        pizzaMenu.extendDescription(dough+" is so fat\n");
    }

    public PizzaMenu build(){
        return this.pizzaMenu;
    }
}
