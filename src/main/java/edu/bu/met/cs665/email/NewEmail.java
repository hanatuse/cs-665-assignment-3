package edu.bu.met.cs665.email;

public class NewEmail implements Email {
    private String recipientName;
    private String welcomeOffer;

    public NewEmail(String recipientName, String welcomeOffer) {
        this.recipientName = recipientName;
        this.welcomeOffer = welcomeOffer;
    }

    @Override
    public String generateContent() {
        return "Dear " + recipientName + ",\n\nWelcome to our service! As a new customer, you can enjoy a special offer: " + welcomeOffer +
                ". Please let us know if you have any questions as you get started. We’re here to help!";
    }
}
