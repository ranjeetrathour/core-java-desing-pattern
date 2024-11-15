package abstractpattern.veg;

import abstractpattern.Burger;

public class VegBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("veg burger");
    }
}
