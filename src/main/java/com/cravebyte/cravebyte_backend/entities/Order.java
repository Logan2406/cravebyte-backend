package com.cravebyte.cravebyte_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="Order")
@Data
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private UUID orderId;

    private LocalDateTime deliveryTime;

    private LocalDateTime orderTime;

    private String paymentId;

    private boolean paymentStatus;

    private String status;

    private double totalAmount;

    @OneToOne
    private Address delAddress;

    @OneToOne
    private FoodUser user;

    @ManyToOne
    private Restaurant restaurant;

    @OneToMany(mappedBy = "order")
    private Set<FoodOrder> foodOrder;
}
