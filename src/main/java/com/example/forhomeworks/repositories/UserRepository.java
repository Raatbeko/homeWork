package com.example.forhomeworks.repositories;

import com.example.forhomeworks.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
