package ru.forque.templatemethod;

/**
 * Author: hetsketch
 * Created: 8/22/2016
 */
public class Test {
    public static void main(String[] args) {
        BrewBeverage bev = new Tea();
        bev.brew();

        System.out.println();

        bev = new Coffee();
        bev.brew();
    }
}
