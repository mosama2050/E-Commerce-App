package com.smsm.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id ;
    private  String firstName ;
    private  String lastName ;
    private  String email ;
    private  String phone ;
    private  String city ;
    private  String postalCode;
    private  String address;


//    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "customer")
//    private Set<CustomerOrder>customerOrders;

}
