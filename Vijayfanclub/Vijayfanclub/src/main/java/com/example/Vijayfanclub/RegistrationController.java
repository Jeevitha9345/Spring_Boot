package com.example.Vijayfanclub;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fanclub")
public class RegistrationController {
    private List<Registration> store=new ArrayList<>();
    @PostMapping
    public List<Registration> addFans(@RequestParam String name,@RequestParam String email,@RequestParam("number") long cont_num,@RequestParam("pass") String pass,@RequestParam String city,@RequestParam("pin") int pin){
        Registration reg=new Registration(name,email,cont_num,pass,city,pin);
        store.add(reg);
        return store;
    }

    @GetMapping
    public List<Registration> getFan(){
        return store;
    }
}
