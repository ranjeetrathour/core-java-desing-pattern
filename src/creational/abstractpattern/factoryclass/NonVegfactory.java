package creational.abstractpattern.factoryclass;

import creational.abstractpattern.Burger;
import creational.abstractpattern.NonVeg.NonVegBurger;
import creational.abstractpattern.NonVeg.NonVegNoodles;
import creational.abstractpattern.NonVeg.NonVegPizza;
import creational.abstractpattern.Noodles;
import creational.abstractpattern.Order;
import creational.abstractpattern.Pizza;

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
