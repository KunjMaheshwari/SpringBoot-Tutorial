package com.example.internalworkingofSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider", havingValue = "stripe")
@ConditionalOnMissingBean(PaymentService.class)
public class StripePaymentService implements PaymentService{
    @Override
    public String pay(){
        String payment = "Stripe Payment";
        System.out.println("Payment from: "+ payment);
        return payment;
    }
}