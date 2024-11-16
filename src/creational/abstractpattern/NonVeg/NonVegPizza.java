package creational.abstractpattern.NonVeg;

import creational.abstractpattern.Pizza;

public class NonVegPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("Prepare non veg pizza..............");
    }
}
