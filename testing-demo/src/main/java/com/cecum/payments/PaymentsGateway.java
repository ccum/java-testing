package com.cecum.payments;

/**
 * PaymentsGateway
 */
public interface PaymentsGateway {

    PaymentResponse requestPayment(PaymentRequest request);
    
}