package com.example.forhomeworks.service.impl;

import com.example.forhomeworks.entity.Airport;
import com.example.forhomeworks.repository.AirportRepository;
import com.example.forhomeworks.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AirportServiceImpl implements AirportService {
    @Autowired
    AirportRepository airportRepository;
    @Override
    public Airport save(Airport airport) throws Exception {
        if (airport == null)throw new Exception("not be empty");
        return airportRepository.save(airport);
    }

    @Override
    public List<Airport> getAll() {
        return airportRepository.findAll();
    }

    @Override
    public Airport findById(Long id) {
        return airportRepository.getById(id);
    }
}
