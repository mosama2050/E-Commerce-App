package com.smsm.ecommerce.repository;

import com.smsm.ecommerce.domain.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemRepository extends JpaRepository <OrderLineItem,Integer> {
}
