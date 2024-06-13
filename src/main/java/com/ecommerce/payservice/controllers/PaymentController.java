package com.ecommerce.payservice.controllers;

import com.ecommerce.payservice.dtos.InitiatePaymentDto;
import com.ecommerce.payservice.services.PaymentService;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentDto initiatePaymentDtoRequest) throws RazorpayException, StripeException {
        return this.paymentService.initiatePayment(initiatePaymentDtoRequest.getOrderId(),initiatePaymentDtoRequest.getEmail(),initiatePaymentDtoRequest.getPhoneNumber(), initiatePaymentDtoRequest.getAmount());
    }
}
