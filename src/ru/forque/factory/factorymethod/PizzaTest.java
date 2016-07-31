package ru.forque.factory.factorymethod;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaStore();

        System.out.println("Grand carne pizza:");
        factory.createPizza("grand carne").prepare();

        System.out.println();

        System.out.println("Pepperoni pizza:");
        factory.createPizza("pepperoni").prepare();
    }
}
