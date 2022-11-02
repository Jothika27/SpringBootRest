package com.kgisl.springmdb.service;

import java.util.List;
import java.util.Optional;

import com.kgisl.springmdb.dto.CustomerDto;
import com.kgisl.springmdb.model.Customer;

public interface CustomerDtoService {
	public List<CustomerDto> getAll();

	public Optional<Customer> getById(String id);

	public void delete(String id);

	public Customer create(Customer c);

	public Customer update(String id, Customer c);
}
