package edu.bu.met.cs665.email;

public class FrequentEmail implements Email {
    private String recipientName;
    private String discountCode;

    public FrequentEmail(String recipientName, String discountCode) {
        this.recipientName = recipientName;
        this.discountCode = discountCode;
    }

    @Override
    public String generateContent() {
        return "Dear " + recipientName + ",\n\nThank you for being a loyal customer! As a token of appreciation, we’d like to offer you a special discount. "
                + "Use code " + discountCode + " on your next purchase to save even more!";
    }
}
