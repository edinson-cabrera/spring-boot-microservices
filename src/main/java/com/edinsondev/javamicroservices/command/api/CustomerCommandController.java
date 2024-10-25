package com.edinsondev.javamicroservices.command.api;

import com.edinsondev.javamicroservices.command.application.services.CustomerService;
import com.edinsondev.javamicroservices.command.domain.entities.Customer;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@Tag(name = "Customer API", description = "Customer API")
public class CustomerCommandController {

    private final CustomerService customerService;

    public CustomerCommandController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Page<Customer> getAll(
            @ParameterObject Pageable pageable
    ) {
        return customerService.findAll(pageable);
    }

}
