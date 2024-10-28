package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.ReturningEmail;

public class ReturningCustomer extends Customer {

    public ReturningCustomer(String name, String email, String productName) {
        super(name, email, new ReturningEmail(name, productName));
    }
}
