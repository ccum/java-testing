package com.cecum.payments;

/**
 * PaymentsGateway
 */
public interface PaymentsGateway {

    PaymentResponse requiestPayment(PaymentRequest request);
    
}