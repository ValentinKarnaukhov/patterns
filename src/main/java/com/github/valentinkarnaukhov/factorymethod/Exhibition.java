package com.github.valentinkarnaukhov.factorymethod;

/**
 * @author Valentin Karnaukhov
 */
public class Exhibition {

    public static void main(String[] args) {
        Breeder dogBreeder = new DogBreeder();
        Breeder catBreeder = new CatBreeder();
        dogBreeder.showAnimal();
        catBreeder.showAnimal();
    }

}
