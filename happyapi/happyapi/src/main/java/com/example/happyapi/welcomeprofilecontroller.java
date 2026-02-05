package com.example.happyapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeprofilecontroller {
    @PostMapping("/welcome")
    public welcomeprofile Profile(@RequestBody welcomeprofile profile){
        return profile;
    }
}
