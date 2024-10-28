package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.customer.*;

public class CustomerFactory {

    public static Customer createCustomer(String type, String name, String email, String productName, String discountCode, String welcomeOffer, String vipOffer, String supportContact) {
        switch (type.toLowerCase()) {
            case "business":
                return new BusinessCustomer(name, email);
            case "returning":
                return new ReturningCustomer(name, email, productName);
            case "frequent":
                return new FrequentCustomer(name, email, discountCode);
            case "new":
                return new NewCustomer(name, email, welcomeOffer);
            case "vip":
                return new VIPCustomer(name, email, vipOffer, supportContact);
            default:
                throw new IllegalArgumentException("Unknown customer type: " + type);
        }
    }
}
