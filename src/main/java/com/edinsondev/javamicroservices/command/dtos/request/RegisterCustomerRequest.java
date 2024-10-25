package com.edinsondev.javamicroservices.command.dtos.request;

import lombok.Value;

@Value
public class RegisterCustomerRequest {
    String customerId;
    String firstName;
    String lastName;
    String email;
}
