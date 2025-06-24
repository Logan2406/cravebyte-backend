package com.cravebyte.cravebyte_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.UUID;

@Entity
public class FoodCategory {

    @Id
    @GeneratedValue
    private UUID catId;

    private String catName;

    @OneToMany(mappedBy = "category")
    List<FoodItem> foods;
}
