package ru.forque.factory.abstractfactory.factory;

import ru.forque.factory.abstractfactory.product.Jeans;
import ru.forque.factory.abstractfactory.product.Trainers;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
public interface ClothesFactory {
    Jeans createJeans();
    Trainers createTrainers();
}
