package com.example.dockercompose.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {
    @GetMapping
    public ResponseEntity<?> check(){
        return new ResponseEntity<>("oke", HttpStatus.OK);
    }
}
