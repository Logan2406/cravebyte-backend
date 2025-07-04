package com.cravebyte.cravebyte_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name="Address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @UuidGenerator
    private UUID addressId;

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
