package ru.forque.command;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
//Concrete command
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
