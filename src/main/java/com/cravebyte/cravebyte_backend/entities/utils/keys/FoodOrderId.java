package com.cravebyte.cravebyte_backend.entities.utils.keys;

import com.cravebyte.cravebyte_backend.entities.FoodOrder;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class FoodOrderId implements Serializable {

    private UUID foodItemId;

    private UUID orderId;

    @Override
    public int hashCode()
    {
        return Objects.hash(foodItemId,orderId);
    }

    @Override
    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(!(o instanceof FoodOrderId)) return false;
        FoodOrderId newId = (FoodOrderId) o;
        return Objects.equals(foodItemId,newId.foodItemId) && Objects.equals(orderId,newId.orderId);
    }

}
