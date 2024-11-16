package creational.abstractpattern.producer;

import creational.abstractpattern.Order;
import creational.abstractpattern.factoryclass.NonVegfactory;
import creational.abstractpattern.factoryclass.VegFactory;

public class ProduceObject {

    /**
     * order is a creational.factory interface which contain many obj
     *
     * @return creational.factory object which return actual object
     */
    public static Order order(String foodType) {
        return switch (foodType) {
            case "veg" -> new VegFactory();
            case "non veg" -> new NonVegfactory();

            default -> throw new IllegalStateException("Unexpected value: " + foodType);
        };
    }
}