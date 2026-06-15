package com.nxpine.nhpark.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nxpine.nhpark.address.domain.Addresses;

@Repository
public interface AddressRepository extends JpaRepository<Addresses, Long> {
    // Standard CRUD methods are automatically provided by JpaRepository
}
