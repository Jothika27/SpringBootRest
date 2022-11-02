package com.kgisl.springmdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.springmdb.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
