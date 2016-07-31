package ru.forque.command;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
//Client
public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);

        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
