package com.cecum.payments;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.cecum.payments.PaymentProcessor;
import com.cecum.payments.PaymentResponse;
import com.cecum.payments.PaymentsGateway;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * PaymentProcessorTest
 */
public class PaymentProcessorTest {

    private PaymentsGateway paymentsGateway;
    private PaymentProcessor paymentProcessornew;

    @Before
    public void setUp(){
        paymentsGateway = Mockito.mock(PaymentsGateway.class);
        paymentProcessornew = new PaymentProcessor(paymentsGateway);

    }
    @Test
    public void payment_is_correct() {
        
        Mockito.when(paymentsGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        boolean result = paymentProcessornew.makePayment(1000);
        
        assertTrue(result);   
    }

    @Test
    public void payment_is_incorrect() {
        Mockito.when(paymentsGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessornew.makePayment(1000));   
    }
}