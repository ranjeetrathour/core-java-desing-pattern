package abstractpattern.factoryclass;

import abstractpattern.Burger;
import abstractpattern.Noodles;
import abstractpattern.Order;
import abstractpattern.Pizza;
import abstractpattern.veg.VegBurger;
import abstractpattern.veg.VegNoodles;
import abstractpattern.veg.VegPizza;

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
