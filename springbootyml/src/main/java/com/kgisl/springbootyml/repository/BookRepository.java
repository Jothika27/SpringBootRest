package com.kgisl.springbootyml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.springbootyml.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
    
}
