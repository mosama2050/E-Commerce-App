package com.smsm.ecommerce.api.mapper;

import com.smsm.ecommerce.api.model.CustomerDTO;
import com.smsm.ecommerce.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer map(CustomerDTO customerDTO);
    CustomerDTO map(Customer customer);
}
