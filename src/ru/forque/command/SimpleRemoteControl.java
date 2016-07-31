package ru.forque.command;

/**
 * Author: hetsketch
 * Created: 7/31/16
 */
//Invoker
public class SimpleRemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
