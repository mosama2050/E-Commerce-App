package com.smsm.ecommerce.api.mapper;


import com.smsm.ecommerce.api.model.ProductDTO;
import com.smsm.ecommerce.domain.Category;
import com.smsm.ecommerce.domain.Product;
import com.smsm.ecommerce.repository.CategoryRepoitory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {

//    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Autowired
    private  CategoryRepoitory categoryRepoitory;



    @Mapping(target = "category", source="categoryId")
//    @Mapping(target ="id", source="productDTO.id")
//    @Mapping(target="lastUpdate", source="productDTO.lastUpdate")
    public abstract Product map(ProductDTO productDTO);

    public Category toCategory(Integer id) {
        return categoryRepoitory.getOne(id);
    }

    @Mapping(source = "category.id", target="categoryId")
    public abstract ProductDTO  map(Product product);

}
