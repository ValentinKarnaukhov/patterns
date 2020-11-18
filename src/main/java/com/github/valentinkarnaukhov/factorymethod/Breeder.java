package com.github.valentinkarnaukhov.factorymethod;

/**
 * @author Valentin Karnaukhov
 */
public abstract class Breeder {

    public void showAnimal(){
        Animal animal = breed();
        animal.makeSound();
    }

    protected abstract Animal breed();
}
