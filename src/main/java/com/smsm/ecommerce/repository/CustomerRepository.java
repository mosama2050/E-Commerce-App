package com.smsm.ecommerce.repository;

import com.smsm.ecommerce.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
        }
