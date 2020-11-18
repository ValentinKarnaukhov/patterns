package com.github.valentinkarnaukhov.factorymethod;

/**
 * @author Valentin Karnaukhov
 */
public class DogBreeder extends Breeder {
    protected Animal breed() {
        return new Dog();
    }
}
