package com.example.person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person_Model {
    @Id
    private Long id;
    private String name;

//    getters and setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}