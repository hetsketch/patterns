package ru.forque.observer.customobserver;

/**
 * This observer send email while alarm
 */
public class EmailSender implements Observer {
    @Override
    public void update() {
        System.out.println("I'm sending email");
    }
}
