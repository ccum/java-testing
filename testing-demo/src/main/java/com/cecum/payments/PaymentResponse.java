package com.cecum.payments;

public class PaymentResponse {

    public enum PaymentStatus {
        OK, ERROR
    }

    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.setStatus(status);
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

}
