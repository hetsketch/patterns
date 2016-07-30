package ru.forque.singleton;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
