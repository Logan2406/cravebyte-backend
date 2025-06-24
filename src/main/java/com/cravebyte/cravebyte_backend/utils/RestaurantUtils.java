package com.cravebyte.cravebyte_backend.utils;

import com.cravebyte.cravebyte_backend.dtos.AddressDto;
import com.cravebyte.cravebyte_backend.dtos.RestaurantDto;
import com.cravebyte.cravebyte_backend.entities.Address;
import com.cravebyte.cravebyte_backend.entities.FoodItem;
import com.cravebyte.cravebyte_backend.entities.Restaurant;
import com.cravebyte.cravebyte_backend.requests.RestaurantRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantUtils {

    public static RestaurantDto convertToDTO(Restaurant restaurant)
    {
        RestaurantDto dto = RestaurantDto.builder().
                restId(String.valueOf(restaurant.getRestId())).
                name(restaurant.getName()).
                bannerImgUrl(restaurant.getBannerImgUrl()).
                closeTime(restaurant.getCloseTime()).
                openTime(restaurant.getOpenTime()).
                createdDate(restaurant.getCreatedDate()).
                address(restaurant.getAddress()).
                isActive(restaurant.isActive()).
                description(restaurant.getDescription()).
                activeFood(restaurant.getFood().stream().filter(FoodItem::isAvailable).toList()).
                inactiveFood(restaurant.getFood().stream().filter(foodItem -> !foodItem.isAvailable()).toList()).
                build();
        return dto;
    }


    public static RestaurantDto convertToDTO(RestaurantRequest request)
    {
        AddressDto addr = AddressDto.builder().
                addressLineOne(request.getAddressLineOne()).
                addressLineTwo(request.getAddressLineTwo()).
                pin(Integer.parseInt(request.getPinCode())).
                lat(Double.parseDouble(request.getLat())).
                lon(Double.parseDouble(request.getLon())).
                city(request.getCity()).
                state(request.getState()).
                build();

        RestaurantDto dto = RestaurantDto.builder().
                name(request.getRestName()).
                bannerImgUrl(request.getBannerImgUrl()).
                closeTime(LocalTime.parse(request.getCloseTime())).
                openTime(LocalTime.parse(request.getOpenTime())).
                createdDate(LocalDate.parse(request.getCreatedDate())).
                isActive(false).
                address(AddressUtils.convertToEntity(addr)).
                build();

        return dto;
    }

    public static Restaurant covertToEntity(RestaurantDto dto)
    {
        return null;
    }
}
