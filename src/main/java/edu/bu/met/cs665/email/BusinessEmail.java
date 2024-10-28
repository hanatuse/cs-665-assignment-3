package edu.bu.met.cs665.email;

public class BusinessEmail implements Email {
    private String recipientName;

    public BusinessEmail(String recipientName) {
        this.recipientName = recipientName;
    }

    @Override
    public String generateContent() {
        return "Dear " + recipientName + ",\n\nThank you for your business. We value our partnership and are here to help you succeed.";
    }
}
