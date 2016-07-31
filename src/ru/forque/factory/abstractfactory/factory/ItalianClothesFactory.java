package ru.forque.factory.abstractfactory.factory;

import ru.forque.factory.abstractfactory.product.ItalianJeans;
import ru.forque.factory.abstractfactory.product.ItalianTrainers;
import ru.forque.factory.abstractfactory.product.Jeans;
import ru.forque.factory.abstractfactory.product.Trainers;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
public class ItalianClothesFactory implements ClothesFactory {
    @Override
    public Jeans createJeans() {
        return new ItalianJeans();
    }

    @Override
    public Trainers createTrainers() {
        return new ItalianTrainers();
    }
}
