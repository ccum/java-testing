package com.cecum.payments;

/**
 * PaymentProcessor
 */
public class PaymentProcessor {

    private PaymentsGateway paymentsGateway;
    
    public PaymentProcessor( PaymentsGateway paymentsGateway) {
       this.paymentsGateway= paymentsGateway;
    }

    public boolean makePayment(double aomunt){
        return false;
    }
}