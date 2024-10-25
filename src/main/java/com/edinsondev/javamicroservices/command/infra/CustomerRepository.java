package com.edinsondev.javamicroservices.command.infra;

import com.edinsondev.javamicroservices.command.domain.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
