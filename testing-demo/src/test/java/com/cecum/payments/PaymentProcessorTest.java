import static org.junit.Assert.assertTrue;

import com.cecum.payments.PaymentProcessor;
import com.cecum.payments.PaymentResponse;
import com.cecum.payments.PaymentsGateway;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * PaymentProcessorTest
 */
public class PaymentProcessorTest {

    @Test
    public void payment_is_correct() {
        PaymentsGateway paymentsGateway = Mockito.mock(PaymentsGateway.class);
        Mockito.when(paymentsGateway.requiestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessornew = new PaymentProcessor(paymentsGateway);
        assertTrue(paymentProcessornew.makePayment(1000));   
    }
}