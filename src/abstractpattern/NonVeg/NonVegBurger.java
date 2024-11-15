package abstractpattern.NonVeg;

import abstractpattern.Burger;

public class NonVegBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Non veg burger ready...........");
    }
}
