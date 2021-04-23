package com.smsm.ecommerce.repository;

import com.smsm.ecommerce.domain.Category;
import com.smsm.ecommerce.domain.OrderLineItem;
import com.smsm.ecommerce.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findAllByCategory(Category category);
    List<Product> findAllByCategoryId(Integer id);
    List<Product> findByNameContaining(String name);
}
