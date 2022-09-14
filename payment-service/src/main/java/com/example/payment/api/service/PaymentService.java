package com.example.payment.api.service;

import com.example.payment.api.entity.Payment;
import com.example.payment.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment){
        // Try to trim short it ???
        payment.setPaymentStatus(paymentProcessing()); //---- helper method
        payment.setTransactionId( UUID.randomUUID().toString().split("-")[0]);
        return repository.save(payment);
    }

    public String paymentProcessing(){
        return  new Random().nextBoolean()?"success":"false";
    }


}
