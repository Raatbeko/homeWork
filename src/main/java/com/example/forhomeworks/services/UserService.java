package com.example.forhomeworks.services;

import com.example.forhomeworks.dto.UserRequest;
import com.example.forhomeworks.entities.User;
import com.example.forhomeworks.exception.EMailIsNullException;
import com.example.forhomeworks.repositories.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService {
    final UserRepository userRepository;

    public UserRequest save(UserRequest userRequest){
        if (userRequest.getEmail() == null)throw new EMailIsNullException("E_mail not be null");
        User user = User.builder()
                .userName(userRequest.getUserName())
                .dateOfRegistration(LocalDateTime.now())
                .eMail(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build();
        userRepository.save(user);
        return userRequest;
    }
}
