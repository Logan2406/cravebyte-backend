package com.cravebyte.cravebyte_backend.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantRequest {

    @NotBlank
    private String restName;

    private String bannerImgUrl;

    private String closeTime;

    private String openTime;

    private String createdDate;

    private String description;

    @NotBlank
    private String addressLineOne;

    private String addressLineTwo;

    private String pinCode;

    private String state;

    private String city;

    private String lat;

    private String lon;




}
