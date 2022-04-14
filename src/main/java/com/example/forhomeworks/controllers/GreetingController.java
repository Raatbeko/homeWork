package com.example.forhomeworks.controllers;

import com.example.forhomeworks.dto.UserRequest;
import com.example.forhomeworks.services.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GreetingController {

    UserService userService;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping(value = "/register/post")
    public String  register(@ModelAttribute("user") UserRequest userRequest) {
//        return userService.save(userRequest);
        return "register";
    }

}
