package ru.forque.observer.customobserver;

/**
 * This observer send SMS while alarm
 */
public class SmsSender implements Observer {
    @Override
    public void update() {
        System.out.println("I'm sending the SMS");
    }
}
