package com.github.workTimeMangementGithub.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class CardController {




  @GetMapping("/hello")
  public ResponseEntity<String> getMessage(){
    return  ResponseEntity.ok("Hzllo");
  }


}
