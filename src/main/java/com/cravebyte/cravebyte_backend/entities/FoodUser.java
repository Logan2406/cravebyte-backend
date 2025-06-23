package com.cravebyte.cravebyte_backend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="User")
@Data
@AllArgsConstructor
public class FoodUser {

    @Id
    @GeneratedValue
    private UUID userId;

    private LocalDateTime joinedAt;

    private String email;

    private String name;

    private String role;

    private String refUserId;

    @OneToOne
    private Address address;

}
