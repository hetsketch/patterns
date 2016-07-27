package ru.forque.decorator;

/**
 * Created by hetsketch on 7/25/16.
 */
public class DecTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.showEquipment();
        System.out.println();

        Car carWithSpoiler =  new CarWithSpoilerDecorator(car);
        carWithSpoiler.showEquipment();
        System.out.println();

        Car carWithSpoilerAndDisks = new CarWithSpoilerDecorator(new CarWithLargeDisksDecorator(new Car()));
        carWithSpoilerAndDisks.showEquipment();
    }
}
