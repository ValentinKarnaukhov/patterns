package com.github.valentinkarnaukhov.builder;

/**
 * @author Valentin Karnaukhov
 */
public class Order {

    public static void main(String[] args) {
        Order order = new Order();
        order.iWantToMakeOrder();
    }

    public void iWantToMakeOrder(){
        PizzaDirector director = new PizzaDirector();

        PizzaMenuBuilder menuBuilder = new PizzaMenuBuilder();
        PizzaDishBuilder pizzaDishBuilder = new PizzaDishBuilder();

        director.cookPepperoniPizza(menuBuilder);
        director.cookPepperoniPizza(pizzaDishBuilder);

        menuBuilder.build().show();
        pizzaDishBuilder.build().show();
    }


}
