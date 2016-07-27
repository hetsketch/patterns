package ru.forque.strategy;

/**
 * Implementation of strategy
 */
public class GasEngine implements Engine {
    @Override
    public void move() {
        System.out.println("I'm gas engine");
    }
}
