package com.example.forhomeworks.repositories;

import com.example.forhomeworks.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query(nativeQuery = true, value = "select u.* from users u where u.user_name =:findByUserNameAndEMail or u.e_mail =:findByUserNameAndEMail")
    User findByUserNameAndEMail(String findByUserNameAndEMail);

}
