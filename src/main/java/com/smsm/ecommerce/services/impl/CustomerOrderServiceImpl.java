package com.smsm.ecommerce.services.impl;

import com.smsm.ecommerce.api.mapper.CartItemMapper;
import com.smsm.ecommerce.api.mapper.CustomerOrderMapper;
import com.smsm.ecommerce.api.model.CartItem;
import com.smsm.ecommerce.api.model.CustomerOderDTO;
import com.smsm.ecommerce.domain.CustomerOrder;
import com.smsm.ecommerce.repository.CustomerOrderRepository;
import com.smsm.ecommerce.services.CustomerOrderService;
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
public class CustomerOrderServiceImpl implements CustomerOrderService {

    private final CustomerOrderRepository customerOrderRepository;
    private final CustomerOrderMapper customerOrderMapper;

    @Override
    public Set<CustomerOderDTO> findAll() {
        return customerOrderRepository.findAll()
                .stream().map(customerOrderMapper::map).collect(Collectors.toSet());
    }

    @Override
    public CustomerOderDTO findById(Integer integer) {
        CustomerOrder customerOrder = customerOrderRepository.findById(integer)
                .orElseThrow(() -> new ResourceNotFoundException(integer.toString()));
        return customerOrderMapper.map(customerOrder);
    }

    @Override
    public CustomerOderDTO save(CustomerOderDTO object) {
        CustomerOrder save = customerOrderRepository.save(customerOrderMapper.map(object));
        return customerOrderMapper.map(save);
    }

    @Override
    public void delete(CustomerOderDTO object) {

    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public Set<CustomerOderDTO> findAllByCustomerId(Integer id) {
        return customerOrderRepository.findAllByCustomerId(id)
                .stream().map(customerOrderMapper::map).collect(Collectors.toSet());
    }
}
