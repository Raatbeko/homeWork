package com.example.forhomeworks.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {
    String userName;

    String email;

    String password;
}
