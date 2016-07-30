package ru.forque.factory.factorymethod;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public abstract class Pizza {

    protected void makeDough() {
        System.out.println("Making dough");
    }

    protected void bake() {
        System.out.println("Baking");
    }

    protected void pack() {
        System.out.println("Packing");
    }

    protected abstract void addIngredients();

}
