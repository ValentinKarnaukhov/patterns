package com.github.valentinkarnaukhov.abstractfactory;

/**
 * @author Valentin Karnaukhov
 */
public class FittingRoom {


    public static void main(String[] args) {
        FittingRoom fittingRoom = new FittingRoom();

        ClothesFactory clothesFactory1 = fittingRoom.tryOn(20);
        clothesFactory1.createHeaddress().show();
        clothesFactory1.createPants().show();
        clothesFactory1.createShoes().show();

        ClothesFactory clothesFactory2 = fittingRoom.tryOn(-20);
        clothesFactory2.createHeaddress().show();
        clothesFactory2.createPants().show();
        clothesFactory2.createShoes().show();
    }

    private ClothesFactory tryOn(int temperature) {
        if (temperature > 10) {
            return new SummerClothesFactory();
        } else {
            return new WinterClothesFactory();
        }
    }

}
