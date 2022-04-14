package com.example.forhomeworks.repositories;

import com.example.forhomeworks.entities.User;
import com.example.forhomeworks.entities.UserLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogRepository extends JpaRepository<UserLogEntity, Long> {
    @Query(nativeQuery = true,value = "select * from where user_id =:userId")
    UserLogEntity getUserById(Long userId);

    @Query(nativeQuery = true,value = "delete from user_logs where user_id =:userId")
    void deleteAllById(Long userId);
}
