package com.example.forhomeworks.entities;

import com.example.forhomeworks.enums.Result;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_logs")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User userEntity;

    @Column(name = "login_time", nullable = false, unique = true)
    LocalDateTime loginTime;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "login_result", nullable = false)
    Result result;



}
