package ru.forque.decorator;

/**
 * Created by hetsketch on 7/25/16.
 */
public class CarWithLargeDisksDecorator extends CarDecorator{
    public CarWithLargeDisksDecorator(Car car) {
        super(car);
    }

    @Override
    public void showEquipment() {
        System.out.println(car.equipment);
        System.out.println("And large disks!");
    }
}
