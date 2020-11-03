package com.smsm.ecommerce.repository;

import com.smsm.ecommerce.domain.OrderLineItem;
import com.smsm.ecommerce.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
