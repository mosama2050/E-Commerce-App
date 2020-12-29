package com.smsm.ecommerce.repository;

import com.smsm.ecommerce.domain.Customer;
import com.smsm.ecommerce.domain.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Integer> {

    List<CustomerOrder> findAllByCustomer(Customer customer);
}
