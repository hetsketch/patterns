package ru.forque.factory.factorymethod;

import ru.forque.factory.factorymethod.product.Pizza;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
interface PizzaFactory {
     Pizza createPizza(String name);
}
