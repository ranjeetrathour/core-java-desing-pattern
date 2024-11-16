package creational.abstractpattern;

public interface Order {
    Burger createBurger();
    Pizza createPizza();
    Noodles createNoodles();
}
