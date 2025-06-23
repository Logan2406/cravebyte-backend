package com.cravebyte.cravebyte_backend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="DeliveryEarning")
@Data
@AllArgsConstructor
public class DeliveryEarning {

    @Id
    @GeneratedValue
    private UUID earningId;

    private double amount;

    private String successfulOderId;

    @OneToOne
    private FoodUser deliveryBoy;


}
