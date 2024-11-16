package creational.abstractpattern.NonVeg;

import creational.abstractpattern.Noodles;

public class NonVegNoodles implements Noodles {
    @Override
    public void prepareNoodle() {
        System.out.println("non veg noodles prepare.............");
    }
}
