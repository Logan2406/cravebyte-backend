package com.cravebyte.cravebyte_backend.utils;

import com.cravebyte.cravebyte_backend.dtos.AddressDto;
import com.cravebyte.cravebyte_backend.entities.Address;
import org.springframework.stereotype.Component;

public class AddressUtils {
    public static Address convertToEntity(AddressDto dto)
    {
        Address address = new Address();

        address.setAddressLineOne(dto.getAddressLineOne());
        address.setAddressLineTwo(dto.getAddressLineTwo());
        address.setPin(dto.getPin());
        address.setCountry("INDIA");
        address.setState(dto.getState());
        address.setCity(dto.getCity());
        address.setLat(dto.getLat());
        address.setLon(dto.getLon());

        return address;
    }
}
