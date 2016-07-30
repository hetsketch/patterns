package ru.forque.factory.factorymethod;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class Pepperoni extends Pizza{
    @Override
    protected void addIngredients() {
        System.out.println("A lot of cheese!");
    }
}
