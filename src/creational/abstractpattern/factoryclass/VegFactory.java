package creational.abstractpattern.factoryclass;

import creational.abstractpattern.Burger;
import creational.abstractpattern.Noodles;
import creational.abstractpattern.Order;
import creational.abstractpattern.Pizza;
import creational.abstractpattern.veg.VegBurger;
import creational.abstractpattern.veg.VegNoodles;
import creational.abstractpattern.veg.VegPizza;

public class VegFactory implements Order {
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }

    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }

    @Override
    public Noodles createNoodles() {
        return new VegNoodles();
    }
}
