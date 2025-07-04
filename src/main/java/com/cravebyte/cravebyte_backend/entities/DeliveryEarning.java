package com.cravebyte.cravebyte_backend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name="DeliveryEarnings")
@Data
@AllArgsConstructor
public class DeliveryEarning {

    @Id
    @UuidGenerator
    private UUID earningId;

    private double amount;

    private String successfulOderId;

    @OneToOne
    private FoodUser deliveryBoy;


}
