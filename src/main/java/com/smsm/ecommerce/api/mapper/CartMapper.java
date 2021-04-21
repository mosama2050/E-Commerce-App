package com.smsm.ecommerce.api.mapper;

import com.smsm.ecommerce.api.model.Cart;
import com.smsm.ecommerce.domain.CustomerOrder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartMapper INSTANCE = Mappers.getMapper(CartMapper.class);

//    Cart map(CustomerOrder customerOrder);
}
