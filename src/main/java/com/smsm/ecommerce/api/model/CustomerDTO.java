package com.smsm.ecommerce.api.model;

import com.smsm.ecommerce.domain.CustomerOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private  Integer id ;
    private  String firstName;
    private  String lastName ;
    private  String email ;
    private  String phone ;
    private  String city ;
    private  String postalCode;
    private  String address;
}
