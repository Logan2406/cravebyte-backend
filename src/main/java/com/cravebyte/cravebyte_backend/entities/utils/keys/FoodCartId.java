package com.cravebyte.cravebyte_backend.entities.utils.keys;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
@Data
@AllArgsConstructor
public class FoodCartId implements Serializable {
    private UUID foodItemId;
    private UUID cartId;

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(!(o instanceof FoodCartId)) return false;
        FoodCartId newId = (FoodCartId) o;
        return Objects.equals(foodItemId,newId.foodItemId) && Objects.equals(cartId,newId.cartId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(foodItemId,cartId);
    }
}
