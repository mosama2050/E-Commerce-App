package com.smsm.ecommerce.api.model;

import com.smsm.ecommerce.domain.Product;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.Instant;
import java.util.Set;

public class CategoryDTO {
private Integer id ;
private String name;
private Instant lastUpdate;
private Set<ProductDTO> products;

}
