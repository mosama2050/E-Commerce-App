package com.smsm.ecommerce.services;

import com.smsm.ecommerce.api.model.ProductDTO;

import java.util.List;

public interface ProductService extends CrudService<ProductDTO, Integer> {
    List<ProductDTO> findByCategoryId(Integer id);
    List<ProductDTO> findByNameContain(String name);
}
