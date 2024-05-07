package it.marconi.springreststudent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import it.marconi.springreststudent.domains.Studente;
import it.marconi.springreststudent.services.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public Studente addStudent(@RequestBody Studente s){
        return studentService.save(s);
    }

    @GetMapping("getstudent")
    public Studente getStudent(){
        return null;
    }
}

