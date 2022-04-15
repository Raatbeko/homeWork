package com.example.forhomeworks.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "ticket_flights")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicketFlight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    /**
     * @noinspection JpaAttributeTypeInspection
     */
    @ManyToOne
    @JoinColumn(name = "flight_id")
    Flight flight;

    /**
     * @noinspection JpaAttributeTypeInspection
     */
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    Ticket ticket;

    @Column(name = "fare_condition", nullable = false)
    @Type(type = "text")
    String fare_condition;

    @Column(name = "amount")
    Long amount;
}
