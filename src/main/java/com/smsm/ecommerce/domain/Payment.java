package com.smsm.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

import static javax.persistence.FetchType.LAZY;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private  double amount;
    private Instant date;
    private  String status;
    private  String transactionID;
    @OneToOne
    private CustomerOrder customerOrder;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

}
