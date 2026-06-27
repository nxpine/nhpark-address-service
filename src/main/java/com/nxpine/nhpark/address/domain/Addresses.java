package com.nxpine.nhpark.address.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "addresses")
@Data
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String province;
    private String postalCode;
    
    @Column(name="country")
    private String country;
    
    @Column(name="phone_number")
    private String phone;

    // link to customer
    @Column(name = "customer_id")
    private Long customerId;
}