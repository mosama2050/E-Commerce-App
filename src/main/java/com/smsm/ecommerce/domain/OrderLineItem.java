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
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    public double calTotal(){
        return quantity * product.getPrice();
    }

}
