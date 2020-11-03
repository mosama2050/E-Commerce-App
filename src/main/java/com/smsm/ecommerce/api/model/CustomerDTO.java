package com.smsm.ecommerce.api.model;

import com.smsm.ecommerce.domain.CustomerOrder;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.Set;

public class CustomerDTO {
    private  Integer id ;
    private  String fristName ;
    private  String lastName ;
    private  String email ;
    private  String phone ;
    private  String city ;
    private  String postilCode ;
}
