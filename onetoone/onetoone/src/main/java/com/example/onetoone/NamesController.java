package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NamesController {
    @Autowired
    private NamesRepo repo;

    @PostMapping("/addNames")
    public Names addName(@RequestBody Names name){
        return repo.save(name);
    }

    @GetMapping("/getNames")
    public List<Names> getNames(){
        return repo.findAll();
    }
}
