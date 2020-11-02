package com.smsm.ecommerce.domain;

import java.time.Instant;

public class Product {
    private Integer id ;
    private String code;
    private String description;
    private Byte[] img ;
    private double price ;
    private int quantity;
    private Instant lastUpdate ;
    private Category category;

}
