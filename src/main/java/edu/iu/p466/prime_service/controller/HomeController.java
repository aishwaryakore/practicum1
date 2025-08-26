package edu.iu.p466.prime_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeController {

    @GetMapping
    public String greetings(){
        return "Welcome to Prime Service!";
    }
}
