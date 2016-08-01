package ru.forque.adapter;

/**
 * Author: hetsketch
 * Created: 8/1/16
 */
public class SimpleDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("I'm simple duck!");
    }
}
