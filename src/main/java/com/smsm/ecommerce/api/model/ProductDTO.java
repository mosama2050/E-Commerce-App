package com.smsm.ecommerce.api.model;

import javassist.bytecode.ByteArray;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Integer id ;
    private String code;
    private String description;
    private int  quantity;
    private byte[] img ;
    private  double price ;
    private Instant lastUpdate;
    private  Integer categoryId;
}
