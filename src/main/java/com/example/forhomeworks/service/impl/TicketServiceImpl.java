package com.example.forhomeworks.service.impl;

import com.example.forhomeworks.entity.Ticket;
import com.example.forhomeworks.repository.TicketRepository;
import com.example.forhomeworks.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketRepository ticketRepository;
    @Override
    public Ticket save(Ticket ticket) throws Exception {
        if (ticket == null) throw new Exception("not be empty");
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepository.getById(id);
    }
}
