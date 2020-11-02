package com.smsm.ecommerce.domain;

import javax.persistence.*;
import java.util.Set;
@Entity
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToMany
    @JoinTable(name = "order_line_item_customer_order" ,
            joinColumns = @JoinColumn(name = "customer_order_id"),
            inverseJoinColumns =@JoinColumn(name = "line_item_id")

    )
    private Set<CustomerOrder> customerOrders;




}
