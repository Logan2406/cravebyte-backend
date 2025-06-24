package com.cravebyte.cravebyte_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
public class IdCounter {

    @Id
    @UuidGenerator
    private UUID id;

    private String prefix;

    private Integer lastNum;
}
