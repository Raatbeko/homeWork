package com.example.forhomeworks.dto;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserForLoginRequest {
    String emailOrUserName;

    String password;

}
