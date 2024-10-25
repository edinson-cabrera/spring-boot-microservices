package com.edinsondev.javamicroservices.command.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Customer {

    @Id
    private Long id;

    private String name;
    private String email;

}
