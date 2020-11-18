package com.github.valentinkarnaukhov.abstractfactory;

/**
 * @author Valentin Karnaukhov
 */
public interface ClothesFactory {

    Headdress createHeaddress();
    Pants createPants();
    Shoes createShoes();

}
