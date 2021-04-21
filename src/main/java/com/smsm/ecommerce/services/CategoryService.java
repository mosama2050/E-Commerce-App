package com.smsm.ecommerce.services;

import com.smsm.ecommerce.api.mapper.CustomerMapper;
import com.smsm.ecommerce.api.model.CustomerDTO;
import com.smsm.ecommerce.domain.Customer;
import com.smsm.ecommerce.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class CategoryService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CategoryService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    
    List<CustomerDTO> getAll(){

        List<Customer> all = customerRepository.findAll();
//        List<CustomerDTO> all2 = new ArrayList<>();
//        for (Customer customer : all) {
//            CustomerDTO map = customerMapper.map(customer);
//            all2.add(map);
//        }
        ///////////////////////////////
//        List<CustomerDTO> all2 = all.stream().map(customer -> customerMapper.map(customer)).collect(Collectors.toList());
        List<CustomerDTO> all2 = all.stream().map(customerMapper::map).collect(Collectors.toList());
        return all2;
    }
}
