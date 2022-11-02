package com.kgisl.springbootyml.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.springbootyml.model.Student;
import com.kgisl.springbootyml.repository.StudentRepository;



@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") int id) {
        Optional<Student> l = studentRepository.findById(id);
        return l;
    }

    @DeleteMapping("/{id}")
    public void deletestudentById(@PathVariable("id") int id) {
        studentRepository.deleteById(id);
    }

    @PostMapping("/")
    public Student createstudent(@RequestBody Student student){
        System.out.println(student);
       return studentRepository.save(student);
    }
    
   @PutMapping("/{id}")
    public Student updatestudentById(@PathVariable("id") int id,@RequestBody Student b){
      return studentRepository.save(b);
    }
    
}
