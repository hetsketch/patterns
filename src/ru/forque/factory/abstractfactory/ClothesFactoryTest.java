package ru.forque.factory.abstractfactory;

import ru.forque.factory.abstractfactory.factory.ClothesFactory;
import ru.forque.factory.abstractfactory.factory.FrenchClothesFactory;
import ru.forque.factory.abstractfactory.factory.ItalianClothesFactory;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
public class ClothesFactoryTest {
    public static void main(String[] args) {
        ClothesFactory factory = new ItalianClothesFactory();
        System.out.println("Italian factory:");
        factory.createJeans().sew();
        factory.createTrainers().rubbing();

        System.out.println( );

        factory = new FrenchClothesFactory();
        System.out.println("French factory:");
        factory.createJeans().sew();
        factory.createTrainers().rubbing();
    }
}
