package com.cravebyte.cravebyte_backend.dtos;

import com.cravebyte.cravebyte_backend.entities.Address;
import com.cravebyte.cravebyte_backend.entities.FoodItem;
import com.cravebyte.cravebyte_backend.entities.FoodUser;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {

    private String restId;

    private String name;

    private String bannerImgUrl;

    private LocalTime closeTime;

    private LocalTime openTime;

    private LocalDate createdDate;

    private String description;

    private boolean isActive;

    private Address address;

    private List<FoodItem> activeFood;

    private List<FoodItem> inactiveFood;

}
