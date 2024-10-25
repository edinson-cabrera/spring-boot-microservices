package com.edinsondev.javamicroservices.command.dtos.response;

import lombok.Value;

@Value
public class ResponseCustomerResponse {
    String customerId;
    String firstName;
    String lastName;
    String email;
}
