package com.kgisl.springbootyml.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.springbootyml.model.Customer;
import com.kgisl.springbootyml.service.CustomerService;


@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> getCustomers() {
        List<Customer> l = customerService.getAll();
        return new ResponseEntity<>(l, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int id) {
        Optional<Customer> l = customerService.getById(id);
        return new ResponseEntity<>(l, HttpStatus.FOUND);
    }

    @PostMapping("/")
    public ResponseEntity<Customer> insertCustomer(@RequestBody Customer c){
        Customer l = customerService.create(c);
        return new ResponseEntity<>(l, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCustomerById(@PathVariable int id){
        customerService.delete(id);
       return new ResponseEntity<>(HttpStatus.GONE);
    }
   
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable int id,@RequestBody Customer customer){
      Customer l = customerService.update(id, customer);
      return new ResponseEntity<>(l, HttpStatus.ACCEPTED);
    
    }
}
