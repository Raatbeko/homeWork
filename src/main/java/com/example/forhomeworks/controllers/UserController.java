package com.example.forhomeworks.controllers;

import com.example.forhomeworks.dto.UserForLoginRequest;
import com.example.forhomeworks.dto.UserRequest;
import com.example.forhomeworks.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/entrance")
@AllArgsConstructor
public class UserController {
    final UserService userService;

    @PostMapping("/registration")
    public String save(@RequestBody UserRequest userRequest){
        return userService.save(userRequest);
    }

    @PostMapping("/login")
    public String login(UserForLoginRequest user){
        return userService.loginUser(user);
    }

}
