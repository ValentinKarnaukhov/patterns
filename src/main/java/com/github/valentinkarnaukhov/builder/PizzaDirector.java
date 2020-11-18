package com.github.valentinkarnaukhov.builder;

/**
 * @author Valentin Karnaukhov
 */
public class PizzaDirector {

    public void cookPepperoniPizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setCheese("Mozzarella");
        pizzaBuilder.setDough("Thin");
        pizzaBuilder.setFilling("Pepperoni");
    }

}
