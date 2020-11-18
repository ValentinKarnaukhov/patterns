package com.github.valentinkarnaukhov.factorymethod;

/**
 * @author Valentin Karnaukhov
 */
public class CatBreeder extends Breeder {
    protected Animal breed() {
        return new Cat();
    }
}
