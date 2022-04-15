package com.example.forhomeworks.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "Airports")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "airport_name",nullable = false)
    String name;

    @Column(name = "city",nullable = false)
    String city;

    @Column(name = "coordinaties",nullable = false)
    String coordinaties;

    @Column(name = "timexone",nullable = false)
    String timezone;
}
