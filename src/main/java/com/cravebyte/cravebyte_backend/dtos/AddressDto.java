package com.cravebyte.cravebyte_backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {

    private String addressId;

    private String addressLineOne;

    private String addressLineTwo;

    private String country;

    private String state;

    private String city;

    private int pin;

    private boolean isDefault;

    private double lat;

    private double lon;
}
