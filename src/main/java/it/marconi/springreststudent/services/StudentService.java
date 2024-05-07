package it.marconi.springreststudent.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marconi.springreststudent.domains.Studente;
import it.marconi.springreststudent.repositories.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepo;

    public Studente save(Studente s){
        return studentRepo.save(s);
    }
}
