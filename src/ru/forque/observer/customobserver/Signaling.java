package ru.forque.observer.customobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Method alarm executes while burglar will get into the car. All observers will run update().
 */
public class Signaling implements Observable {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void alarm() {
        System.out.println("Call the police! We're under attack!");
        notifyObservers();
    }
}
