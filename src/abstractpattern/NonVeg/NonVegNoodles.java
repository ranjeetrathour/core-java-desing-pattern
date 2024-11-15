package abstractpattern.NonVeg;

import abstractpattern.Noodles;

public class NonVegNoodles implements Noodles {
    @Override
    public void prepareNoodle() {
        System.out.println("non veg noodles prepare.............");
    }
}
