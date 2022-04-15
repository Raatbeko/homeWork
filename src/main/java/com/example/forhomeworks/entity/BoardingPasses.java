package com.example.forhomeworks.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "boarding_passes")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BoardingPasses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * @noinspection JpaAttributeTypeInspection
     */
    @ManyToOne
    @JoinColumn(name = "ticket_flgiht_id")
    TicketFlight ticketFlight;

    @Column(name = "seat_no", nullable = false)
    Long seatNo;


}
