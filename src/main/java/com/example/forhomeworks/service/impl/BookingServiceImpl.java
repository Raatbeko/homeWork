package com.example.forhomeworks.service.impl;

import com.example.forhomeworks.entity.Booking;
import com.example.forhomeworks.repository.BookingRepository;
import com.example.forhomeworks.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepository bookingRepository;
    @Override
    public Booking save(Booking booking) throws Exception {
        if (booking == null) throw new Exception("not be empty");
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking findById(Long id) {
        return bookingRepository.getById(id);
    }
}