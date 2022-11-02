package com.kgisl.springbootyml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.springbootyml.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    
}
