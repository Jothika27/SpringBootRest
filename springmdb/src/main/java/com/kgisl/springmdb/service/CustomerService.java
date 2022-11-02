package com.kgisl.springmdb.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springmdb.dto.CustomerDto;
import com.kgisl.springmdb.model.Customer;
import com.kgisl.springmdb.repository.CustomerRepository;

@Service
public class CustomerService implements CustomerDtoService {
	@Autowired
	private CustomerRepository customerRepository;

	// fuction to change Customer to customerDto manualy
	private CustomerDto changeDto(Customer c) {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(c.getId());
		customerDto.setName(c.getName());
		customerDto.setEmail(c.getEmail());
		customerDto.setSalary(c.getSalary());
		return customerDto;
	}

	public List<CustomerDto> getAll() {
		return ((List<Customer>) customerRepository.findAll()).stream().map(this::changeDto)
				.collect(Collectors.toList());
	}

	public Optional<Customer> getById(String id) {
		Optional<Customer> l = customerRepository.findById(id).stream().findAny();
		return l;
	}

	public void delete(String id) {
		customerRepository.deleteById(id);
	}

	public Customer create(Customer c) {
		return customerRepository.save(c);
	}

	public Customer update(String id, Customer c) {
		return customerRepository.save(c);
	}
}
