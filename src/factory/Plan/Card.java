package factory.Plan;

public class Card implements  Payment{
    @Override
    public void pay() {
        System.out.println("card payment process");
    }
}
