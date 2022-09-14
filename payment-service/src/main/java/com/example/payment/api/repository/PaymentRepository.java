package com.example.payment.api.repository;


import com.example.payment.api.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {


}
