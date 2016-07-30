package ru.forque.singleton;

/**
 * Author: hetsketch
 * Created: 7/30/16
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    //only one thread can enter in this method
    public synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
