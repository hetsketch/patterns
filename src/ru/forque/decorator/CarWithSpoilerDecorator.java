package ru.forque.decorator;

/**
 * Created by hetsketch on 7/25/16.
 */
public class CarWithSpoilerDecorator extends CarDecorator{
    public CarWithSpoilerDecorator(Car car) {
        super(car);
    }

    @Override
    public void showEquipment() {
        System.out.println(car.equipment);
        System.out.println("Also I have a spoiler!");
    }
}
