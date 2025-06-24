package com.cravebyte.cravebyte_backend.entities;

import com.cravebyte.cravebyte_backend.entities.utils.keys.FoodCartId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class FoodCart {

    @EmbeddedId
    private FoodCartId id;


    @ManyToOne
    @MapsId("cartId")
    private Cart cart;

    @ManyToOne
    @MapsId("foodItemId")
    private FoodItem food;
}
