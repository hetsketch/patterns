package ru.forque.factory.abstractfactory.factory;

import ru.forque.factory.abstractfactory.product.FrenchJeans;
import ru.forque.factory.abstractfactory.product.FrenchTrainers;
import ru.forque.factory.abstractfactory.product.Jeans;
import ru.forque.factory.abstractfactory.product.Trainers;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
public class FrenchClothesFactory implements ClothesFactory{
    @Override
    public Jeans createJeans() {
        return new FrenchJeans();
    }

    @Override
    public Trainers createTrainers() {
        return new FrenchTrainers();
    }
}
