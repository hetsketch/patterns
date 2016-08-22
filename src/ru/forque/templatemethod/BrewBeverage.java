package ru.forque.templatemethod;

/**
 * Author: hetsketch
 * Created: 8/22/2016
 */
public abstract class BrewBeverage {
    final void brew(){
        boilWater();
        addContent();
        addWater();
    }

    private void addWater() {
        System.out.println("Adding water...");
    }


    protected abstract void addContent();

    private void boilWater() {
        System.out.println("Boiling water...");
    }
}
