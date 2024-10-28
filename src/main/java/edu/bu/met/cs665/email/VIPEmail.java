package edu.bu.met.cs665.email;

public class VIPEmail implements Email {
    private String recipientName;
    private String vipOffer;
    private String supportContact;

    public VIPEmail(String recipientName, String vipOffer, String supportContact) {
        this.recipientName = recipientName;
        this.vipOffer = vipOffer;
        this.supportContact = supportContact;
    }

    @Override
    public String generateContent() {
        return "Dear " + recipientName + ",\n\nAs one of our VIP customers, we’d like to offer you exclusive access to " + vipOffer +
                ". For any assistance, please feel free to reach out to our VIP support at " + supportContact + ". Thank you for being a valued member!";
    }
}
