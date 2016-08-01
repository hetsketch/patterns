package ru.forque.adapter;

/**
 * Author: hetsketch
 * Created: 8/1/16
 */
public class AdapterTest {
    public static void main(String[] args) {
        Duck duck = new SimpleDuck();
        duck.quack();

        Turkey turkey = new SimpleTurkey();
        turkey.gobble();

        System.out.println();

        Duck duck1 = new DuckAdapter(turkey);
        duck1.quack();
    }
}
