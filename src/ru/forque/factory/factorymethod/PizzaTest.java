package ru.forque.factory.factorymethod;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        PizzaStore store = new PizzaStore(factory);
        store.getPizza("grand carne");
    }
}
