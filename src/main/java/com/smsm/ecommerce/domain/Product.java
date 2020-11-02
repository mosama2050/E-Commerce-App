package com.smsm.ecommerce.domain;

import javafx.scene.control.CustomMenuItem;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;
    private String code;
    private String description;
    private Byte[] img ;
    private double price ;
    private int quantity;
    private Instant lastUpdate ;
    @ManyToOne
    private Category category;


}
