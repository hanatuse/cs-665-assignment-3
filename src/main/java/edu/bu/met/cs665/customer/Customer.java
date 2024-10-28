package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.Email;

public abstract class Customer {
    protected String name;
    protected String email;
    protected Email emailType;

    public Customer(String name, String email, Email emailType) {
        this.name = name;
        this.email = email;
        this.emailType = emailType;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String generateEmail() {
        return emailType.generateContent();
    }
}
