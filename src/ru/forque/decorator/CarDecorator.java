package ru.forque.decorator;

/**
 * Created by hetsketch on 7/25/16.
 */
public abstract class CarDecorator extends Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
}
