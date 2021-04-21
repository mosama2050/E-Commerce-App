package com.smsm.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String orderStatus;
    private double orderAmount; // kilo w nos tmatm
    private Instant orderDate;

    @ManyToMany
    @JoinTable(name = "order_line_item_customer_order" ,
            inverseJoinColumns   = @JoinColumn(name = "customer_order_id"),
            joinColumns     =@JoinColumn(name = "line_item_id")
    )
    private List<OrderLineItem> orderLineItems;

//    @OneToOne
//    private  Payment payment;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

}
