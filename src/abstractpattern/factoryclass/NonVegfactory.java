package abstractpattern.factoryclass;

import abstractpattern.Burger;
import abstractpattern.NonVeg.NonVegBurger;
import abstractpattern.NonVeg.NonVegNoodles;
import abstractpattern.NonVeg.NonVegPizza;
import abstractpattern.Noodles;
import abstractpattern.Order;
import abstractpattern.Pizza;

public class NonVegfactory implements Order {
    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }

    @Override
    public Pizza createPizza() {
        return new NonVegPizza();
    }

    @Override
    public Noodles createNoodles() {
        return new NonVegNoodles();
    }
}
