package ru.forque.strategy;

/**
 * Implementation of strategy
 */
public class DieselEngine implements Engine {
    @Override
    public void move() {
        System.out.println("I'm diesel engine!");
    }
}
