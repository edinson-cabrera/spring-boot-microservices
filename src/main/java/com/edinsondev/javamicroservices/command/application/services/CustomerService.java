package com.edinsondev.javamicroservices.command.application.services;

import com.edinsondev.javamicroservices.command.domain.entities.Customer;
import com.edinsondev.javamicroservices.command.infra.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping(
            path = ""
    )
    public Page<Customer> findAll(
            Pageable pageable
    ) {
        return customerRepository.findAll(pageable);
    }
}
