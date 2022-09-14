package com.example.order.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

// This is PAYMENT dto

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment implements Serializable {
    private  int paymentId;
    private String paymentStatus;
    private String transactionId;


    //these two fields are added later--- these are from Order ENTITY
    private int orderId;
    private double amount;  // IS this a price from Order entity ??




}
