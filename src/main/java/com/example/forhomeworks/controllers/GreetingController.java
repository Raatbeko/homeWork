package com.example.forhomeworks.controllers;

import com.example.forhomeworks.dto.UserRequest;
import com.example.forhomeworks.services.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GreetingController {
    final UserService userService;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping(value = "/register/post", consumes = {
            MediaType.MULTIPART_FORM_DATA_VALUE
    })
    public UserRequest register(@ModelAttribute UserRequest userRequest) {
        return userService.save(userRequest);
    }

}
