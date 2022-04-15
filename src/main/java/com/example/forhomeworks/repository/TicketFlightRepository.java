package com.example.forhomeworks.repository;

import com.example.forhomeworks.entity.TicketFlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketFlightRepository extends JpaRepository<TicketFlight,Long> {
}
