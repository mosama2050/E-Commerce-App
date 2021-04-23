package com.smsm.ecommerce.services.impl;

import com.smsm.ecommerce.api.mapper.CustomerMapper;
import com.smsm.ecommerce.api.model.CustomerDTO;
import com.smsm.ecommerce.domain.Customer;
import com.smsm.ecommerce.repository.CustomerRepository;
import com.smsm.ecommerce.services.CustomerService;
import com.smsm.ecommerce.services.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@AllArgsConstructor
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    @Transactional(readOnly = true)
    public Set<CustomerDTO> findAll() {
        return  customerRepository.findAll()
                    .stream().map(customerMapper::map).collect(Collectors.toSet());
    }

    @Override
    @Transactional(readOnly = true)
    public CustomerDTO findById(Integer integer) {
        Customer customer = customerRepository.findById(integer)
                .orElseThrow(() -> new ResourceNotFoundException(integer.toString()));
        return customerMapper.map(customer);
    }

    @Override
    public CustomerDTO save(CustomerDTO object) {
        Customer save = customerRepository.save(customerMapper.map(object));
        return customerMapper.map(save);
    }

    @Override
    public void delete(CustomerDTO object) {
        customerRepository.delete(customerMapper.map(object));
    }

    @Override
    public void deleteById(Integer integer) {
        customerRepository.deleteById(integer);
    }
}
