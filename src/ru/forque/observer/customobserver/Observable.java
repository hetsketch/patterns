package ru.forque.observer.customobserver;

public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
