package com.smsm.ecommerce.api.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.Instant;

public class CustomerOderDTO {
    private Integer id;
    private double totalPrice;
    private Instant orderDate;
    private  String status;
    private Integer customerId;
  //  private Set<cartitem> TODO

}
