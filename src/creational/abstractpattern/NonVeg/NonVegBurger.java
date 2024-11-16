package creational.abstractpattern.NonVeg;

import creational.abstractpattern.Burger;

public class NonVegBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Non veg burger ready...........");
    }
}
