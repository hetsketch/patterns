package ru.forque.factory.factorymethod;

import ru.forque.factory.factorymethod.product.GrandCarne;
import ru.forque.factory.factorymethod.product.Pepperoni;
import ru.forque.factory.factorymethod.product.Pizza;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class PizzaStore implements PizzaFactory{
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
