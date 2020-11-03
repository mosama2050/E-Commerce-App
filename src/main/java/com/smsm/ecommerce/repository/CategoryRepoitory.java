package com.smsm.ecommerce.repository;

import com.smsm.ecommerce.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepoitory extends JpaRepository <Category ,Integer>{
}
