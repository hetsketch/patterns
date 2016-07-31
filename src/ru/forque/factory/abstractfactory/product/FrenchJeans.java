package ru.forque.factory.abstractfactory.product;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
public class FrenchJeans extends Jeans {
    @Override
    public void sew() {
        System.out.println("I'm french jeans");
    }
}
