package ru.forque.strategy;

/**
 * This context uses strategy Engine
 */
public class Car {
    private String color;
    private Engine engine;

    public Car(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void ride() {
        engine.move();
    }
}
