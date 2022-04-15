package com.example.forhomeworks.service.impl;

import com.example.forhomeworks.entity.Seat;
import com.example.forhomeworks.repository.SeatRepository;
import com.example.forhomeworks.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    SeatRepository seatRepository;
    @Override
    public Seat save(Seat seat) throws Exception {
        if (seat == null) throw new Exception("not be empty");
        return seatRepository.save(seat);
    }

    @Override
    public List<Seat> getAll() {
        return seatRepository.findAll();
    }

    @Override
    public Seat findById(Long id) {
        return seatRepository.getById(id);
    }
}
