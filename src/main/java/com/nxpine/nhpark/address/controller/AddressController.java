package com.nxpine.nhpark.address.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpine.nhpark.address.domain.Addresses;
import com.nxpine.nhpark.address.service.AddressService;

@RestController
@RequestMapping("/address")
@CrossOrigin(origins = "*")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    // PAGE: get all addresses
    @GetMapping
    public List<Addresses> getAll() {
        return addressService.getAllAddresses();
    }

    // PAGE: get single address
    @GetMapping("/{id}")
    public Addresses getById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }
    // Create customer
    @PostMapping
    public Addresses create(@RequestBody Addresses newAddress) {
    	return addressService.createAddress(newAddress);
    	}
    
    @PatchMapping("/{id}")
    public Addresses update(@PathVariable Long id, @RequestBody Addresses updatedAddress) {
    	return addressService.updateAddress(id, updatedAddress);
    }
    
}