package com.example.forhomeworks.repository;

import com.example.forhomeworks.entity.BoardingPasses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardingPassesRepository extends JpaRepository<BoardingPasses,Long> {
}
