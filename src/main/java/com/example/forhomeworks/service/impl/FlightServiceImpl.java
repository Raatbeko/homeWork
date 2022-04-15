package com.example.forhomeworks.service.impl;

import com.example.forhomeworks.entity.Flight;
import com.example.forhomeworks.repository.FlightRepository;
import com.example.forhomeworks.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightRepository flightRepository;

    @Override
    public Flight save(Flight flight) throws Exception {
        if (flight == null) throw new Exception("not be empty");
        return flightRepository.save(flight);

    }

    @Override
    public List<Flight> getAll() {
        return flightRepository.findAll();
    }

    @Override
    public Flight findById(Long id) {
        return flightRepository.getById(id);
    }
}
