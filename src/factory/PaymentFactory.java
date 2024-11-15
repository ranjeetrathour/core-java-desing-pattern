package factory;

import factory.Plan.Card;
import factory.Plan.Netbanking;
import factory.Plan.Online;
import factory.Plan.Payment;

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
