package ru.forque.factory.factorymethod;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class GrandCarne extends Pizza {
    @Override
    protected void addIngredients() {
        System.out.println("Different meats");
    }
}
