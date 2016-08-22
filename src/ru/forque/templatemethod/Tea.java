package ru.forque.templatemethod;

/**
 * Author: hetsketch
 * Created: 8/22/2016
 */
public class Tea extends BrewBeverage {
    @Override
    protected void addContent() {
        System.out.println("Adding tea pocket...");
    }
}
