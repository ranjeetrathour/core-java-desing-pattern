package abstractpattern.producer;

import abstractpattern.Order;
import abstractpattern.factoryclass.NonVegfactory;
import abstractpattern.factoryclass.VegFactory;

public class ProduceObject {

    /**
     * order is a factory interface which contain many obj
     *
     * @return factory object which return actual object
     */
    public static Order order(String foodType) {
        return switch (foodType) {
            case "veg" -> new VegFactory();
            case "non veg" -> new NonVegfactory();

            default -> throw new IllegalStateException("Unexpected value: " + foodType);
        };
    }
}