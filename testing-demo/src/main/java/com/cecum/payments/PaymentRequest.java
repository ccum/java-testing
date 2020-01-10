package com.cecum.payments;

public class PaymentRequest {

    public PaymentRequest(double amount) {
        this.amount = amount;
    }
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
