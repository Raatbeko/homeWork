package com.example.forhomeworks.entity;

import com.example.forhomeworks.enums.FlightStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "flight_no", nullable = false)
    Long flightNo;

    @Column(name = "scheduled_departure", nullable = false)
    String scheduledDeparture;

    @Column(name = "scheduled_arrival", nullable = false)
    String scheduledArrival;

    /**
     * @noinspection JpaAttributeTypeInspection
     */
    @ManyToOne
    @JoinColumn(name = "arrival_airport",nullable = false)
    Airport arrivalAirport;

    /**
     * @noinspection JpaAttributeTypeInspection
     */
    @ManyToOne
    @JoinColumn(name = "departure_airport",nullable = false)
    Airport departureAirport;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status",nullable = false)
    FlightStatus flightStatus;

    /**
     * @noinspection JpaAttributeTypeInspection
     */
    @ManyToOne
    @JoinColumn(name = "aircraft_code",nullable = false)
    Aircraft aircraft;

    @Column(name = "actual_departure",nullable = false)
    LocalDateTime actualDeparture;

    @Column(name = "actual_arrival",nullable = false)
    LocalDateTime actualArrival;
}
