package com.smsm.ecommerce.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.Instant;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOderDTO {
    private Integer id;
    private double totalPrice;
    private Instant orderDate;
    private  String status;
    private Integer customerId;
    private List<CartItem> orderline;

}
