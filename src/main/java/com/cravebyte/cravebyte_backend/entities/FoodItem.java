package com.cravebyte.cravebyte_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@Entity
@Table(name="Food")
public class FoodItem {

    @Id
    @GeneratedValue
    private UUID foodId;

    private String foodName;

    private double foodPrice;

    private double discountRate;

    private LocalDateTime createdAt;

    private String description;

    private String imgUrl;

    private boolean isAvailable;

    //category and cuisine

}
