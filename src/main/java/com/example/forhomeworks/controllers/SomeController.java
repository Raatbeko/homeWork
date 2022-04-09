package com.example.forhomeworks.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SomeController {

    @RequestMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("HelloWorld.html");

        return modelAndView;
    }

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("wiht-name")
    public String hello2(@RequestBody String name) {
        return "Hello" + name + "!!!";
    }

}
