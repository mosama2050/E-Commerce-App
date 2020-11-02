package com.smsm.ecommerce.domain;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;
@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;
    private  String orderStatus ;
    private double orderAmount; // kilo w nos tmatm
    private Instant orderDate;

    @ManyToMany
    @JoinTable(name = "order_line_item_customer_order" ,
            inverseJoinColumns   = @JoinColumn(name = "customer_order_id"),
            joinColumns     =@JoinColumn(name = "line_item_id")

    )


    private Set<OrderLineItem>orderLineItems;

//    @OneToOne
//    private  Payment payment;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
