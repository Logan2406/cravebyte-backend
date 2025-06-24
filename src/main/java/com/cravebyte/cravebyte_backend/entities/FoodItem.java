package com.cravebyte.cravebyte_backend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@Entity
@Table(name="Food")
public class FoodItem {

    @Id
    private String foodId;

    private String foodName;

    private double foodPrice;

    private double discountRate;

    private LocalDateTime createdAt;

    private String description;

    private String imgUrl;

    private boolean isAvailable;

    @ManyToOne
    private FoodCategory category;

    @ManyToOne
    private Cuisine cuisine;

    @ManyToOne
    private Restaurant restaurant;

}
