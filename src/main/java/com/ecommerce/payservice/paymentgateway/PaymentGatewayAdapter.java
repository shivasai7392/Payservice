package com.ecommerce.payservice.paymentgateway;

import com.razorpay.RazorpayException;

public interface PaymentGatewayAdapter {
    String generatePaymentLink(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException;
}
