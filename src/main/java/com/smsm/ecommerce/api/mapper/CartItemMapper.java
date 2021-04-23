package com.smsm.ecommerce.api.mapper;

import com.smsm.ecommerce.api.model.CartItem;
import com.smsm.ecommerce.domain.OrderLineItem;
import com.smsm.ecommerce.domain.Product;
import com.smsm.ecommerce.repository.ProductRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class CartItemMapper {
//    CartItemMapper INSTANCE = Mappers.getMapper(CartItemMapper.class);

    @Autowired
    private ProductRepository productRepository;

    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "total", expression = "java(orderLineItem.calTotal())")
    public abstract CartItem map(OrderLineItem orderLineItem);

    @Mapping(target = "product", source = "productId")
    @Mapping(target = "customerOrders", ignore = true)
    public abstract OrderLineItem map(CartItem cartItem);

    Product convert(Integer productId){
        return productRepository.findById(productId).get();
    }
}
