package com.example.forhomeworks.service.impl;

import com.example.forhomeworks.entity.Aircraft;
import com.example.forhomeworks.repository.AircraftRepository;
import com.example.forhomeworks.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AircraftServiceImpl implements AircraftService {
    @Autowired
    AircraftRepository aircraftRepository;

    @Override
    public Aircraft save(Aircraft aircraft) throws Exception {
        if (aircraft == null) throw new Exception("not be empty");
        aircraftRepository.save(aircraft);
        return null;
    }

    @Override
    public List<Aircraft> getAll() {
        return aircraftRepository.findAll();
    }

    @Override
    public Aircraft findById(Long id) {
        return aircraftRepository.getById(id);
    }
}
