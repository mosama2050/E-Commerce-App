package com.smsm.ecommerce.services;

import com.smsm.ecommerce.api.model.CustomerOderDTO;

import java.util.Set;

public interface CustomerOrderService extends CrudService<CustomerOderDTO, Integer>{
    Set<CustomerOderDTO> findAllByCustomerId(Integer id);
}
