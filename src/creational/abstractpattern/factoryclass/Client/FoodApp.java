package creational.abstractpattern.factoryclass.Client;


import creational.abstractpattern.Order;
import creational.abstractpattern.producer.ProduceObject;

public class FoodApp {
    public static void main(String[] args) {

        Order order = ProduceObject.order("veg");
        order.createBurger().prepareBurger();

    }
}
