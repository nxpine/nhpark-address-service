package com.nxpine.nhpark.address.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpine.nhpark.address.domain.Addresses;
import com.nxpine.nhpark.address.service.AddressService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("address")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AddressController {

    private final AddressService addressService;

    @GetMapping
    public List<Addresses> getAll() {
       return addressService.getAllAddresses();
    }
}

