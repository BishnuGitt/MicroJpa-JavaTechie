package com.example.order.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ORDER_TB")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int orderId;   //this orderId for Payment class
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;

}
