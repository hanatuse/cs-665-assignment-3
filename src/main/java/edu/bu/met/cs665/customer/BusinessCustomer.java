package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.BusinessEmail;

public class BusinessCustomer extends Customer {

    public BusinessCustomer(String name, String email) {
        super(name, email, new BusinessEmail(name));
    }
}
