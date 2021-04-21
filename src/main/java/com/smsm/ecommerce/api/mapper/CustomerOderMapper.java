package com.smsm.ecommerce.api.mapper;

import com.smsm.ecommerce.api.model.CartItem;
import com.smsm.ecommerce.api.model.CustomerOderDTO;
import com.smsm.ecommerce.domain.CustomerOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerOderMapper {
    CustomerOderMapper INSTANCE = Mappers.getMapper(CustomerOderMapper.class);

    @Mapping(target = "orderStatus", source = "status")
    @Mapping(target = "orderAmount", source = "totalPrice")
    CustomerOrder map(CustomerOderDTO customerOderDTO);

    @Mapping(target = "orderline", source = "orderline")
    CustomerOderDTO map(CustomerOrder customerOrder, List<CartItem> orderline);
}
