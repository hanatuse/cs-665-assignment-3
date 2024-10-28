package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.FrequentEmail;

public class FrequentCustomer extends Customer {

    public FrequentCustomer(String name, String email, String discountCode) {
        super(name, email, new FrequentEmail(name, discountCode));
    }
}
