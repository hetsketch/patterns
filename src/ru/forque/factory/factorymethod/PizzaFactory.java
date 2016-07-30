package ru.forque.factory.factorymethod;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class PizzaFactory {
    public Pizza createPizza(String name) {
        if (name.equals("grand carne")) {
            return new GrandCarne();
        }
        if (name.equals("pepperoni")){
            return new Pepperoni();
        }
        return null;
    }
}
