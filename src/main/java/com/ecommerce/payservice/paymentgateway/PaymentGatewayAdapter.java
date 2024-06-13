package com.ecommerce.payservice.paymentgateway;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentGatewayAdapter {
    String generatePaymentLink(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException, StripeException;
}
