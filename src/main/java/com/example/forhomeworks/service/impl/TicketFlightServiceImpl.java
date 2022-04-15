package com.example.forhomeworks.service.impl;

import com.example.forhomeworks.entity.TicketFlight;
import com.example.forhomeworks.repository.TicketFlightRepository;
import com.example.forhomeworks.service.TicketFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketFlightServiceImpl implements TicketFlightService {
    @Autowired
    TicketFlightRepository ticketFlightRepository;

    @Override
    public TicketFlight save(TicketFlight ticketFlight) throws Exception {
        if (ticketFlight == null)throw new Exception("not be null");
        return ticketFlightRepository.save(ticketFlight);
    }

    @Override
    public List<TicketFlight> getAll() {
        return ticketFlightRepository.findAll();
    }

    @Override
    public TicketFlight findById(Long id) {
        return ticketFlightRepository.getById(id);
    }
}
