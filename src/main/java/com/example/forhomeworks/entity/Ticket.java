package com.example.forhomeworks.entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * @noinspection JpaAttributeTypeInspection
     */
    @OneToMany
    @JoinColumn(name = "booking_ref",nullable = false)
    Booking booking;

    @Column(name = "passenger_name", nullable = false)
    String name;

    @Column(name = "passenger_id",nullable = false)
    Long passengerId;

    @Column(name = "contact_data",nullable = false)
    LocalDateTime contact_data;
}
