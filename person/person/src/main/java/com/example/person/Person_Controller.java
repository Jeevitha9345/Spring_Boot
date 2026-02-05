package com.example.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Person_Controller {
//    constructor
    private final person_repository repo;

    public Person_Controller(person_repository repo){
        this.repo=repo;
    }
    @PostMapping("/add")
    public Person_Model addPerson(@RequestParam String name){
        Person_Model p=new Person_Model();
        p.setId(System.currentTimeMillis());
        p.setName(name);
        return repo.save(p);
    }

    @GetMapping("/all")
    public List<Person_Model> getAll(){
        return repo.findAll();
    }
}
