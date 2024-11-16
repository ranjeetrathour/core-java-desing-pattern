package creational.factory;

import creational.factory.Plan.Card;
import creational.factory.Plan.Netbanking;
import creational.factory.Plan.Online;
import creational.factory.Plan.Payment;

public class PaymentFactory {
    public Payment getPayment(String paymentType) {

        /**
         * return object as per the client requirement
         */
        return switch (paymentType) {
            case "card" -> new Card();
            case "net banking" -> new Netbanking();
            case "online" -> new Online();
            default -> null;
        };
    }
}
