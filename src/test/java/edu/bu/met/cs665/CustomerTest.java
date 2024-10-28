package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;
import edu.bu.met.cs665.factory.CustomerFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testBusinessCustomerEmail() {
        Customer businessCustomer = CustomerFactory.createCustomer("business", "Alice", "alice@company.com", null, null, null, null, null);
        String expectedEmail = "Dear Alice,\n\nThank you for your business. We value our partnership and are here to help you succeed.";
        assertEquals(expectedEmail, businessCustomer.generateEmail());
    }

    @Test
    public void testReturningCustomerEmail() {
        Customer returningCustomer = CustomerFactory.createCustomer("returning", "Bob", "bob@example.com", "Laptop", null, null, null, null);
        String expectedEmail = "Dear Bob,\n\nWelcome back! We hope you enjoyed your recent purchase of Laptop. Let us know if you have any questions or need assistance. We look forward to serving you again!";
        assertEquals(expectedEmail, returningCustomer.generateEmail());
    }

    @Test
    public void testFrequentCustomerEmail() {
        Customer frequentCustomer = CustomerFactory.createCustomer("frequent", "Charlie", "charlie@example.com", null, "SAVE20", null, null, null);
        String expectedEmail = "Dear Charlie,\n\nThank you for being a loyal customer! As a token of appreciation, we’d like to offer you a special discount. Use code SAVE20 on your next purchase to save even more!";
        assertEquals(expectedEmail, frequentCustomer.generateEmail());
    }

    @Test
    public void testNewCustomerEmail() {
        Customer newCustomer = CustomerFactory.createCustomer("new", "David", "david@example.com", null, null, "10% Off First Purchase", null, null);
        String expectedEmail = "Dear David,\n\nWelcome to our service! As a new customer, you can enjoy a special offer: 10% Off First Purchase. Please let us know if you have any questions as you get started. We’re here to help!";
        assertEquals(expectedEmail, newCustomer.generateEmail());
    }

    @Test
    public void testVIPCustomerEmail() {
        Customer vipCustomer = CustomerFactory.createCustomer("vip", "Eve", "eve@example.com", null, null, null, "Free Shipping", "vip-support@company.com");
        String expectedEmail = "Dear Eve,\n\nAs one of our VIP customers, we’d like to offer you exclusive access to Free Shipping. For any assistance, please feel free to reach out to our VIP support at vip-support@company.com. Thank you for being a valued member!";
        assertEquals(expectedEmail, vipCustomer.generateEmail());
    }
}
