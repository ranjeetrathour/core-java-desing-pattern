package creational.abstractpattern.veg;

import creational.abstractpattern.Pizza;

public class VegPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("veg pizza ready........");
    }
}
