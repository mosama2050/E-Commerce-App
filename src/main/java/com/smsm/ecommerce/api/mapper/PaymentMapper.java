package com.smsm.ecommerce.api.mapper;

import com.smsm.ecommerce.api.model.PaymentDTO;
import com.smsm.ecommerce.domain.Customer;
import com.smsm.ecommerce.domain.CustomerOrder;
import com.smsm.ecommerce.domain.Payment;
import com.smsm.ecommerce.repository.CustomerOrderRepository;
import com.smsm.ecommerce.repository.CustomerRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class PaymentMapper {

    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    @Mapping(expression = "java(getCustomer(paymentDTO.getCustomerId()))", target = "customer")
    @Mapping(expression = "java(getCustomerOrder(paymentDTO.getCustomerOrderId()))", target = "customerOrder")
    public abstract Payment map(PaymentDTO paymentDTO);

    @Mapping(target = "customerOrderId", source = "customerOrder.id")
    @Mapping(target = "customerId", source = "customer.id")
    public abstract PaymentDTO map(Payment payment);


    public Customer getCustomer(Integer integer){
        return customerRepository.findById(integer).get();
    }

    public CustomerOrder getCustomerOrder(Integer customerOrderId){
        return customerOrderRepository.findById(customerOrderId).get();
    }

}
