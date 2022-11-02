package com.kgisl.springbootyml.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springbootyml.model.Customer;
import com.kgisl.springbootyml.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
       return customerRepository.findAll();
    }
    public Optional<Customer> getById(int id){
       return customerRepository.findById(id);
    }

    public void delete(int id){
        customerRepository.deleteById(id);
    }
    public Customer create(Customer c){
       return customerRepository.save(c);
    }
    public Customer update(int id,Customer c){
       return customerRepository.save(c);
    }
    
}
