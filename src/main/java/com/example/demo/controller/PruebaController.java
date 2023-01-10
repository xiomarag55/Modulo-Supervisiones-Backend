package com.example.demo.controller;


import com.example.demo.entity.ParametroEntity;
import com.example.demo.entity.UserPruebaEntity;
import com.example.demo.repository.ParametroRepository;
import com.example.demo.repository.UserPruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "", allowedHeaders = "", methods = { RequestMethod.GET, RequestMethod.POST,
        RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD, RequestMethod.PUT, RequestMethod.PATCH })
public class PruebaController {
    @Autowired
    private UserPruebaRepository userPruebaRepository;
    @Autowired
    private ParametroRepository parametroRepository;

    @GetMapping("/users")
    private List<UserPruebaEntity> getAllUser() {
        return userPruebaRepository.findAll();
    }


    @GetMapping("/parametros")
    private List<ParametroEntity> getAllParametro() {
        return parametroRepository.findAll();
    }


    @GetMapping("/lista")
    public ResponseEntity<List<ParametroEntity>> lista(){
        List<ParametroEntity> lista = parametroRepository.ListParametroView();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
}
