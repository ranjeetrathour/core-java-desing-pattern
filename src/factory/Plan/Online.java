package factory.Plan;

public class Online implements Payment{
    @Override
    public void pay() {
        System.out.println("online payment process");
    }
}
