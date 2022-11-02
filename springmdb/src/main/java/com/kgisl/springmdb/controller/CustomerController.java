package com.kgisl.springmdb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.springmdb.dto.CustomerDto;
import com.kgisl.springmdb.model.Customer;
import com.kgisl.springmdb.service.CustomerService;

import com.google.gson.Gson;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	Gson gson = new Gson();

	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAllCustomers() {
		List<CustomerDto> l = customerService.getAll();
		String ele = gson.toJson(l);
		return new ResponseEntity<>(ele, HttpStatus.OK);
	}

	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable String id) {
		Optional<Customer> l = customerService.getById(id);
		return new ResponseEntity<>(l, HttpStatus.FOUND);
	}

	@PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> insertCustomer(@RequestBody Customer c) {
		Customer l = customerService.create(c);
		String ele = gson.toJson(l);
		return new ResponseEntity<>(ele, HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteCustomerById(@PathVariable String id) {
		customerService.delete(id);
		return new ResponseEntity<>(HttpStatus.GONE);
	}

	@PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
		Customer l = customerService.update(id, customer);
		String ele = gson.toJson(l);
		return new ResponseEntity<>(ele, HttpStatus.ACCEPTED);

	}
}
