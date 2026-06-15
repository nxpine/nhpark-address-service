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
    private String country;

    // link to customer
    @Column(name = "customer_id")
    private Long customerId;
}