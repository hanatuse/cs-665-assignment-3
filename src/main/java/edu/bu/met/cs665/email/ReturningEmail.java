package edu.bu.met.cs665.email;

public class ReturningEmail implements Email {
    private String recipientName;
    private String productName;

    public ReturningEmail(String recipientName, String productName) {
        this.recipientName = recipientName;
        this.productName = productName;
    }

    @Override
    public String generateContent() {
        return "Dear " + recipientName + ",\n\nWelcome back! We hope you enjoyed your recent purchase of " + productName +
                ". Let us know if you have any questions or need assistance. We look forward to serving you again!";
    }
}
