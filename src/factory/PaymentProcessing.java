package factory;

import factory.Plan.Payment;

public class PaymentProcessing {
    public static void main(String[] args) {

        PaymentFactory paymentFactory = new PaymentFactory();

        Payment onlinePayment = paymentFactory.getPayment("online");
        onlinePayment.pay();
    }
}
