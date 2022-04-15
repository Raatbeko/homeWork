package com.example.forhomeworks.service.impl;

import com.example.forhomeworks.entity.BoardingPasses;
import com.example.forhomeworks.repository.BoardingPassesRepository;
import com.example.forhomeworks.service.BoardingPassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoardingPassesServiceImpl implements BoardingPassesService {
    @Autowired
    BoardingPassesRepository boardingPassesRepository;

    @Override
    public BoardingPasses save(BoardingPasses boardingPasses) throws Exception {
        if (boardingPasses == null)throw new Exception("not be empty");
        return boardingPassesRepository.save(boardingPasses);
    }

    @Override
    public List<BoardingPasses> getAll() {
        return boardingPassesRepository.findAll();
    }

    @Override
    public BoardingPasses findById(Long id) {
        return boardingPassesRepository.getById(id);
    }


}
