package com.ra2.users.ra2_users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ra2.users.ra2_users.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public ResponseEntity<String> crearUsuari(@RequestBody User user) {   
        userRepository.crearUsuari(user);   
        return ResponseEntity.ok("Usuari  creat: " + user.getName());
    }

    @GetMapping("/users")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    
}
