package com.smsm.ecommerce.api.model;

import com.smsm.ecommerce.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.Instant;
import java.util.List;
import java.util.Set;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private Integer id ;
    private String name;
    private Instant lastUpdate;
    private List<ProductDTO> products;
}