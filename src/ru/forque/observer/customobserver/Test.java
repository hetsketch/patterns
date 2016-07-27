package ru.forque.observer.customobserver;

public class Test {
    public static void main(String[] args) {
        Signaling signaling = new Signaling();

        signaling.addObserver(new SmsSender());
        signaling.addObserver(new EmailSender());

        signaling.alarm();
    }
}
