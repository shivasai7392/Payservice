package com.ecommerce.payservice.paymentgateway;

public class StripePaymentGateway implements PaymentGatewayAdapter{
    @Override
    public String generatePaymentLink(String orderId, Long amount, String phoneNumber, String email) {
        return null;
    }
}
