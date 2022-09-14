package com.example.order.api.controller;

import com.example.order.api.common.TransactionRequest;
import com.example.order.api.common.TransactionResponse;
import com.example.order.api.entity.Order;
import com.example.order.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request){
        return null;
    }





}
