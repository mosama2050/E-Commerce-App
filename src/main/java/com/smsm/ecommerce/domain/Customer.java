package com.smsm.ecommerce.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id ;
    private  String fristName ;
    private  String lastName ;
    private  String email ;
    private  String phone ;
    private  String city ;
    private  String postilCode ;
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "customer")
    private Set<CustomerOrder>customerOrders;

}
