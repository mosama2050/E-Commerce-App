package com.smsm.ecommerce.api.mapper;

import com.smsm.ecommerce.api.model.CategoryDTO;
import com.smsm.ecommerce.api.model.ProductDTO;
import com.smsm.ecommerce.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category map(CategoryDTO categoryDTO );

    @Mapping(target = "products" , source = "products")
    CategoryDTO map(Category category, List<ProductDTO> products);
}
