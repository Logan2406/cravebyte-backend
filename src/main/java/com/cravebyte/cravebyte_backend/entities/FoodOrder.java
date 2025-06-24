package com.cravebyte.cravebyte_backend.entities;

import com.cravebyte.cravebyte_backend.entities.utils.keys.FoodCartId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class FoodOrder {

    @EmbeddedId
    private FoodCartId id;

    @ManyToOne
    @MapsId("foodItemId")
    private FoodItem foodItem;

    @ManyToOne
    @MapsId("orderId")
    private Order order;

}


















