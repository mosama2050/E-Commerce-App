package com.smsm.ecommerce.api.model;

import java.time.Instant;

public class PaymentDTO {
    private  Integer id ;
    private  double amount;
    private Instant date;
    private  String status;
    private  String transactionID;
    private Integer customerId;
    private Integer customerOrderId;
}
