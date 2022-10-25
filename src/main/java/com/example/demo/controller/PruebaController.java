package com.example.demo.controller;

import com.example.demo.entity.UserPruebaEntity;
import com.example.demo.repository.UserPruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PruebaController {
    @Autowired
    private UserPruebaRepository userPruebaRepository;

    @GetMapping("/a")
    private String prueba(@RequestParam String user, @RequestParam String pass) {
        UserPruebaEntity userSave = new UserPruebaEntity();
        userSave.setUsername(user);
        userSave.setPassword(pass);
        userPruebaRepository.save(userSave);
        System.out.println(user + pass);
        return "Funciono";
    }

    @GetMapping("/all")
    private List<UserPruebaEntity> getAll() {
        return userPruebaRepository.findAll();
    }

}
