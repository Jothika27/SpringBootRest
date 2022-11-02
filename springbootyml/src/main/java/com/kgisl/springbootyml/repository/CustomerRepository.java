package com.kgisl.springbootyml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.springbootyml.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    
}
