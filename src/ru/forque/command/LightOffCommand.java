package ru.forque.command;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
//Concrete command
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
