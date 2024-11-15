package abstractpattern.veg;

import abstractpattern.Pizza;

public class VegPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("veg pizza ready........");
    }
}
