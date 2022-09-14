package com.example.order.api.service;

import com.example.order.api.common.Payment;
import com.example.order.api.common.TransactionRequest;
import com.example.order.api.common.TransactionResponse;
import com.example.order.api.entity.Order;
import com.example.order.api.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private RestTemplate restTemplate;


    public TransactionResponse saverOrder(TransactionRequest request) {
        String response = "";

        Order order = request.getOrder();
        Payment payment = request.getPayment();

        // what about the other fields ??
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

        // rest call
        Payment paymentResponse = restTemplate.postForObject("http://localhost:9191/payment/doPayment", payment, Payment.class);

        response = paymentResponse.getPaymentStatus().equals("Success") ? "SuccessFull" : "Faillure";
        repository.save(order);

        return new TransactionResponse(order, paymentResponse.getTransactionId(), paymentResponse.getAmount(), response);
    }




}
