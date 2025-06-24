package com.cravebyte.cravebyte_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="Restaurant")
@Data
@AllArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue
    private UUID restId;

    private String name;


    private String bannerImgUrl;

    private LocalTime closeTime;

    private LocalTime openTime;

    private LocalDate createdDate;

    private String description;

    private boolean isActive;


    @OneToOne
    private Address address;

    @OneToMany
    private List<FoodUser> managers;

    @OneToOne
    private FoodUser owner;

    @OneToMany
    private List<FoodUser> staffs;

    @OneToMany(mappedBy = "restaurant")
    private List<FoodItem> food;

}
