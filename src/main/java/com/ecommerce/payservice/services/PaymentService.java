package com.ecommerce.payservice.services;

import com.ecommerce.payservice.paymentgateway.PaymentGatewayAdapter;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewayAdapter paymentGatewayAdapter;
    public PaymentService(PaymentGatewayAdapter paymentGatewayAdapter) {
        this.paymentGatewayAdapter = paymentGatewayAdapter;
    }

    public String initiatePayment(String orderId, String emailId, String phoneNumber, Long amount) throws RazorpayException {
        return this.paymentGatewayAdapter.generatePaymentLink(orderId,amount,phoneNumber,emailId);
    }
}
