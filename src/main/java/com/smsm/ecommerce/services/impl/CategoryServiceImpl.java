package com.smsm.ecommerce.services.impl;

import com.smsm.ecommerce.api.mapper.CategoryMapper;
import com.smsm.ecommerce.api.mapper.ProductMapper;
import com.smsm.ecommerce.api.model.CategoryDTO;
import com.smsm.ecommerce.api.model.ProductDTO;
import com.smsm.ecommerce.domain.Category;
import com.smsm.ecommerce.repository.CategoryRepoitory;
import com.smsm.ecommerce.repository.ProductRepository;
import com.smsm.ecommerce.services.CategoryService;
import com.smsm.ecommerce.services.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Slf4j
@AllArgsConstructor
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepoitory categoryRepoitory;
    private final ProductRepository productRepository;
    private final CategoryMapper categoryMapper;
    private final ProductMapper productMapper;

    @Override
    @Transactional(readOnly = true)
    public Set<CategoryDTO> findAll() {

        return categoryRepoitory.findAll()
                .stream().map(category -> {
                    List<ProductDTO> products = productRepository.findAllByCategory(category)
                            .stream().map(productMapper::map).collect(Collectors.toList());
                    return categoryMapper.map(category, products);
                }).collect(Collectors.toSet());
    }

    @Override
    @Transactional(readOnly = true)
    public CategoryDTO findById(Integer integer) {
        Category category = categoryRepoitory.findById(integer)
                .orElseThrow(() -> new ResourceNotFoundException(integer.toString()));
        List<ProductDTO> products = productRepository.findAllByCategory(category)
                .stream().map(productMapper::map).collect(Collectors.toList());
        return categoryMapper.map(category, products);
    }

    @Override
    public CategoryDTO save(CategoryDTO object) {
        Category save = categoryRepoitory.save(categoryMapper.map(object));
        return categoryMapper.map(save,new ArrayList<>());
    }

    @Override
    public void delete(CategoryDTO object) {
        categoryRepoitory.delete(categoryMapper.map(object));
        //TODO if products not delete , delete it with your self
    }

    @Override
    public void deleteById(Integer integer) {
        categoryRepoitory.deleteById(integer);
        //TODO if products not delete , delete it with your self
    }
}
