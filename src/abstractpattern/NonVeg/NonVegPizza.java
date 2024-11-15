package abstractpattern.NonVeg;

import abstractpattern.Pizza;

public class NonVegPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("Prepare non veg pizza..............");
    }
}
