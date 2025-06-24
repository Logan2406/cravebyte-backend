package com.cravebyte.cravebyte_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.UUID;

@Entity
public class Cuisine {

    @Id
    @GeneratedValue
    private UUID cuisineId;

    private String cuisineName;

    @OneToMany(mappedBy = "cuisine")
    List<FoodItem> foods;
}
