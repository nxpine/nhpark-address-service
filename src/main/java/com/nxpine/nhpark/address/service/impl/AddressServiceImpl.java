package com.nxpine.nhpark.address.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nxpine.nhpark.address.domain.Addresses;
import com.nxpine.nhpark.address.repository.AddressRepository;
import com.nxpine.nhpark.address.service.AddressService;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

   
    @Override
    public List<Addresses> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Addresses getAddressById(Long id) {
        return addressRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Address not found: " + id));
    }

    @Override
	public Addresses createAddress(Addresses newAddress) {
		return addressRepository.save(newAddress);
	}
    @Override
	public Addresses updateAddress(Long id, Addresses updatedAddress) {
		return addressRepository.save(updatedAddress);
	}
}
