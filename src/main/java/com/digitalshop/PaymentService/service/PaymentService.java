package com.digitalshop.PaymentService.service;

import com.digitalshop.PaymentService.model.PaymentRequest;
import com.digitalshop.PaymentService.model.PaymentResponse;


public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
