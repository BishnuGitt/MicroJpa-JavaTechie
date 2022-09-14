package com.example.order.api.common;

import com.example.order.api.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// this class combines Order and Payment classes for Response
// These values/class are suppose tobe single dto but only for Demo, we are doing this way
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

    private Order order;

//    private Payment payment; // instead of this Payment, we can use the following the variable from Payment class
    private String transactionId;
    private double amount;
    private  String message;



}
