package com.smsm.ecommerce.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private  Integer id ;
    private  double amount;
    private Instant date;
    private  String status;
    private  String transactionID;
    private Integer customerId;
    private Integer customerOrderId;
}
