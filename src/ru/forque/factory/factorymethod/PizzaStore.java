package ru.forque.factory.factorymethod;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class PizzaStore {
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza getPizza(String name) {
        Pizza pizza;
        pizza =  pizzaFactory.createPizza(name);

        pizza.makeDough();
        pizza.addIngredients();
        pizza.bake();
        pizza.pack();

        return pizza;
    }
}
