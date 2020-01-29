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
        PaymentResponse response = paymentsGateway.requestPayment(new PaymentRequest(aomunt));
        if(response.getStatus() == PaymentResponse.PaymentStatus.OK ){
            return true;
        }
        else{
            return false;
        }
    }
}