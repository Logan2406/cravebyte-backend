package com.cravebyte.cravebyte_backend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="Cart")
@Data
@AllArgsConstructor
public class Cart {

    @Id
    @GeneratedValue
    private UUID cartId;

    private LocalDateTime createdAt;

    @OneToOne
    private FoodUser user;

    @ManyToMany
    List<FoodItem> foods;

}
