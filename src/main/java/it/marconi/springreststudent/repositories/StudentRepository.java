package it.marconi.springreststudent.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import it.marconi.springreststudent.domains.Studente;

public class StudentRepository extends JpaRepository<Studente, UUID>{

    public Studente save(Studente s) {

    }
    
}

