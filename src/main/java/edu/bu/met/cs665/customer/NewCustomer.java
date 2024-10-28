package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.NewEmail;

public class NewCustomer extends Customer {

    public NewCustomer(String name, String email, String welcomeOffer) {
        super(name, email, new NewEmail(name, welcomeOffer));
    }
}
