package com.smsm.ecommerce.api.mapper;

import com.smsm.ecommerce.api.model.CartItem;
import com.smsm.ecommerce.api.model.CustomerOderDTO;
import com.smsm.ecommerce.domain.CustomerOrder;
import com.smsm.ecommerce.domain.OrderLineItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public abstract class CustomerOrderMapper {
//    CustomerOrderMapper INSTANCE = Mappers.getMapper(CustomerOrderMapper.class);

    @Autowired
    private CartItemMapper cartItemMapper;

    @Mapping(target = "orderStatus", source = "status")
    @Mapping(target = "orderAmount", source = "totalPrice")
    @Mapping(target = "orderLineItems", source = "orderline")
    public abstract CustomerOrder map(CustomerOderDTO customerOderDTO);

    @Mapping(target = "orderline", source = "orderLineItems")
    public abstract CustomerOderDTO map(CustomerOrder customerOrder);

    List<OrderLineItem> convert(List<CartItem> cartItems){
        return cartItems.stream().map(cartItemMapper::map).collect(Collectors.toList());
    }

    List<CartItem> converts(List<OrderLineItem> cartItems){
        return cartItems.stream().map(cartItemMapper::map).collect(Collectors.toList());
    }
}
