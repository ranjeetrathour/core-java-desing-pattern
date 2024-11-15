package abstractpattern.veg;

import abstractpattern.Noodles;

public class VegNoodles implements Noodles {
    @Override
    public void prepareNoodle() {
        System.out.println("veg noodles prepare");
    }
}
