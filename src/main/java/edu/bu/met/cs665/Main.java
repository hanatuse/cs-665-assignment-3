package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;
import edu.bu.met.cs665.factory.CustomerFactory;

public class Main {

    public static void main(String[] args) {
        Customer businessCustomer = CustomerFactory.createCustomer("business", "Alice", "alice@company.com", null, null, null, null, null);
        Customer returningCustomer = CustomerFactory.createCustomer("returning", "Bob", "bob@example.com", "Laptop", null, null, null, null);
        Customer frequentCustomer = CustomerFactory.createCustomer("frequent", "Charlie", "charlie@example.com", null, "SAVE20", null, null, null);
        Customer newCustomer = CustomerFactory.createCustomer("new", "David", "david@example.com", null, null, "10% Off First Purchase", null, null);
        Customer vipCustomer = CustomerFactory.createCustomer("vip", "Eve", "eve@example.com", null, null, null, "Free Shipping", "vip-support@company.com");

        System.out.println("Business Customer Email:\n" + businessCustomer.generateEmail());
        System.out.println("\nReturning Customer Email:\n" + returningCustomer.generateEmail());
        System.out.println("\nFrequent Customer Email:\n" + frequentCustomer.generateEmail());
        System.out.println("\nNew Customer Email:\n" + newCustomer.generateEmail());
        System.out.println("\nVIP Customer Email:\n" + vipCustomer.generateEmail());
    }
}
