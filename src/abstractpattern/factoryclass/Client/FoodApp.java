package abstractpattern.factoryclass.Client;


import abstractpattern.Burger;
import abstractpattern.Order;
import abstractpattern.producer.ProduceObject;

public class FoodApp {
    public static void main(String[] args) {

        Order order = ProduceObject.order("veg");
        order.createBurger().prepareBurger();

    }
}
