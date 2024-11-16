package creational.factory.Plan;

public class Netbanking implements Payment{
    @Override
    public void pay() {
        System.out.println("net banking payment process ");
    }
}
