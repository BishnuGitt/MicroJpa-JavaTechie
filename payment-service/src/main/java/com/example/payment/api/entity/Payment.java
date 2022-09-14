package com.example.payment.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_TB")
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int paymentId;
    private String paymentStatus;
    private String transactionId;


    //these two fields are added later--- these are from Order ENTITY
    // How these fields are working in building the Relationship(foreign)
    private int orderId;
    private double amount;  // this a price from Order entity




}
