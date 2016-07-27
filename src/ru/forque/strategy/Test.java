package ru.forque.strategy;

/**
 * Strategy allows to change the implementation of the Engine on the go
 */
public class Test {
    public static void main(String[] args) {
        Engine gasEngine = new GasEngine();
        Engine dieselEngine = new DieselEngine();

        Car car = new Car("red", gasEngine);
        car.ride();

        car.setEngine(dieselEngine);
        car.ride();
    }
}
