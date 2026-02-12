package com.example.OrderEx;

import com.example.OrderEx.Entity.OrderEntity;
import com.example.OrderEx.Entity.UserEntity;
import com.example.OrderEx.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepo repo;
    @PostMapping("/addUsers")
    public UserEntity addUser(@RequestBody UserEntity user){
        if(user.getOrders()!=null){
            for(OrderEntity order:user.getOrders()){
                order.setUser(user);
            }
        }
        return repo.save(user);
    }
    @GetMapping("/users")
    public List<UserEntity> getUser(){
        return repo.findAll();
    }
}
