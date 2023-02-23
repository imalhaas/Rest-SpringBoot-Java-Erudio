package com.API.RestSpringBootJavaErudio.Controller;

import com.API.RestSpringBootJavaErudio.Model.Person;
import com.API.RestSpringBootJavaErudio.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> listar(){
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person buscarPeloCodigo(@PathVariable Long id){
        return personRepository.findById(id).orElseThrow();
    }

    }


