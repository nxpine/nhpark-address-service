package com.nxpine.nhpark.address.service;

import java.util.List;

import com.nxpine.nhpark.address.domain.Addresses;

public interface AddressService {
	
	List<Addresses> getAllAddresses();

	Addresses getAddressById(Long id);

	Addresses createAddress(Addresses newAddress);

	Addresses updateAddress(Long id, Addresses updatedAddress);
    
}

	