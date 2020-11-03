package com.smsm.ecommerce.repository;

import com.smsm.ecommerce.domain.OrderLineItem;
import com.smsm.ecommerce.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository  extends JpaRepository<Payment,Integer> {
}
