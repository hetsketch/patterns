package ru.forque.factory.factorymethod.product;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class GrandCarne extends Pizza {
    @Override
    public void prepare() {
        System.out.println("I'm grand carne pizza");
    }
}
