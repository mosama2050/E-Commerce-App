package com.smsm.ecommerce.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id ;
    private  double amount;
    private Instant date;
    private  String status;
    private  String transactionID;
    @OneToOne
    private CustomerOrder customerOrder;

    @ManyToOne
    private Customer customer;

}
