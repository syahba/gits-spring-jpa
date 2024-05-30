package com.example.assignment_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment_2.entity.Address;

@Repository

public interface AddressRepository extends JpaRepository<Address, Long> {
  
}
