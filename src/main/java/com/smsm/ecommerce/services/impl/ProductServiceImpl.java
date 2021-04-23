package com.smsm.ecommerce.services.impl;

import com.smsm.ecommerce.api.mapper.ProductMapper;
import com.smsm.ecommerce.api.model.ProductDTO;
import com.smsm.ecommerce.domain.Product;
import com.smsm.ecommerce.repository.ProductRepository;
import com.smsm.ecommerce.services.ProductService;
import com.smsm.ecommerce.services.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j ///AOP
@AllArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public Set<ProductDTO> findAll() {
        return productRepository.findAll()
                .stream().map(productMapper::map).collect(Collectors.toSet());
    }

    @Override
    public ProductDTO findById(Integer integer) {
        Product product = productRepository.findById(integer)
                .orElseThrow(() -> new ResourceNotFoundException(integer.toString()));
        return productMapper.map(product);
    }

    @Override
    public ProductDTO save(ProductDTO object) {
        Product save = productRepository.save(productMapper.map(object));
        return productMapper.map(save);
    }

    @Override
    public void delete(ProductDTO object) {
        productRepository.delete(productMapper.map(object));
    }

    @Override
    public void deleteById(Integer integer) {
        productRepository.deleteById(integer);
    }

    @Override
    public List<ProductDTO> findByCategoryId(Integer id) {
        return productRepository.findAllByCategoryId(id)
                .stream().map(productMapper::map).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> findByNameContain(String name) {
        return productRepository.findByNameContaining(name)
                .stream().map(productMapper::map).collect(Collectors.toList());
    }
}
