package com.example.orderservice.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
    @Id
    private String orderId;
}
