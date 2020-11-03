package com.smsm.ecommerce.api.model;

import javassist.bytecode.ByteArray;

import java.time.Instant;

public class ProductDTO {
    private Integer id ;
    private String code;
    private String description;
    private int  quantity;
    private byte[] img ;
    private  double price ;
    private Instant lastUpdate;
    private  Integer categoryId ;
}
