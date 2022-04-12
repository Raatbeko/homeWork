package com.example.forhomeworks.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",nullable = false,unique = true)
    private String userName;

    @Column(name = "e_mail",nullable = false,unique = true)
    private String eMail;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "date_of_registration")
    private LocalDateTime dateOfRegistration;

}

