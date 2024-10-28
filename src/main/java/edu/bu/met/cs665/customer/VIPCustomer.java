package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.VIPEmail;

public class VIPCustomer extends Customer {

    public VIPCustomer(String name, String email, String vipOffer, String supportContact) {
        super(name, email, new VIPEmail(name, vipOffer, supportContact));
    }

}
