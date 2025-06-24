package com.cravebyte.cravebyte_backend.controller;

import com.cravebyte.cravebyte_backend.requests.RestaurantRequest;
import com.cravebyte.cravebyte_backend.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(@Autowired RestaurantService restaurantService, RestaurantService restaurantService1)
    {
        this.restaurantService = restaurantService1;
    }

    @PostMapping("/add_restaurant")
    public String addRestaurant(@Valid @RequestBody RestaurantRequest restaurant)
    {

        try{

        }catch (Exception e)
        {

        }


        return "ADDED";
    }
}
