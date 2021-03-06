package com.smsm.ecommerce.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private  Integer id ;
    private  Integer productId ;
    private  int quantity ;
    private  double total ;


}
