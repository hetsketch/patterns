package ru.forque.adapter;

/**
 * Author: hetsketch
 * Created: 8/1/16
 */
public class DuckAdapter implements Duck {
    Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
