package com.example.forhomeworks.services;

import com.example.forhomeworks.dto.UserForLoginRequest;
import com.example.forhomeworks.dto.UserRequest;
import com.example.forhomeworks.entities.User;
import com.example.forhomeworks.entities.UserLogEntity;
import com.example.forhomeworks.enums.Result;
import com.example.forhomeworks.exception.EMailIsNullException;
import com.example.forhomeworks.repositories.UserLogRepository;
import com.example.forhomeworks.repositories.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService {
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserLogRepository userLogRepository;


    public String save(UserRequest userRequest) {

        if (userRequest.getEmail() == null) throw new EMailIsNullException("E_mail not be null");

        User user = User.builder()
                .userName(userRequest.getUserName())
                .dateOfRegistration(LocalDateTime.now())
                .eMail(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build();
        userRepository.save(user);

        User userEntity = userRepository.findByUserNameAndEMail(userRequest.getUserName());
        userLogRepository
                .save(UserLogEntity.builder()
                        .userEntity(userEntity)
                        .loginTime(LocalDateTime.now())
                        .result(Result.SUCCESS)
                        .build());
        return "success!";
    }

    public String loginUser(UserForLoginRequest user) {
        User user1 = userRepository.findByUserNameAndEMail(user.getEmailOrUserName());
        if (user1 == null) return "Cannot be empty";
        userLogRepository
                .save(UserLogEntity.builder()
                        .userEntity(user1)
                        .loginTime(LocalDateTime.now())
                        .result(Result.SUCCESS)
                        .build());
        return "Success";
    }


}
