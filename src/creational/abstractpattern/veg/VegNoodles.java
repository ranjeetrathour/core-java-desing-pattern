package creational.abstractpattern.veg;

import creational.abstractpattern.Noodles;

public class VegNoodles implements Noodles {
    @Override
    public void prepareNoodle() {
        System.out.println("veg noodles prepare");
    }
}
