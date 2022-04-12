package com.example.forhomeworks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

    @GetMapping("/{name}")
    public String getGreeting(@PathVariable(name = "name") String name){
        return "greeting";
    }
}
