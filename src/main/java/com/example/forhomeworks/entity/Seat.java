package com.example.forhomeworks.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "seats")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    /**
     * @noinspection JpaAttributeTypeInspection
     */
    @ManyToOne
    @JoinColumn(name = "aircraft_code", nullable = false)
    Aircraft aircraft;

    @Column(name = "fare_condition", nullable = false)
    @Type(type = "text")
    String fare_condition;
}
