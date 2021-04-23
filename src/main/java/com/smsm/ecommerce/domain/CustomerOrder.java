package com.smsm.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Collection;
import java.util.Comparator;
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
    private double orderAmount;
    private Instant orderDate;

    @ManyToMany(cascade = CascadeType.ALL)
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

    public boolean add(OrderLineItem orderLineItem) {
        return orderLineItems.add(orderLineItem);
    }

    public boolean remove(Object o) {
        return orderLineItems.remove(o);
    }

    public boolean contains(Object o) {
        return orderLineItems.contains(o);
    }

    public boolean containsAll(Collection<?> c) {
        return orderLineItems.containsAll(c);
    }

    public boolean addAll(Collection<? extends OrderLineItem> c) {
        return orderLineItems.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends OrderLineItem> c) {
        return orderLineItems.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return orderLineItems.removeAll(c);
    }

    public void sort(Comparator<? super OrderLineItem> c) {
        orderLineItems.sort(c);
    }

    public void clear() {
        orderLineItems.clear();
    }

    public OrderLineItem set(int index, OrderLineItem element) {
        return orderLineItems.set(index, element);
    }

    public void add(int index, OrderLineItem element) {
        orderLineItems.add(index, element);
    }

    public OrderLineItem remove(int index) {
        return orderLineItems.remove(index);
    }

    public int indexOf(Object o) {
        return orderLineItems.indexOf(o);
    }
}
