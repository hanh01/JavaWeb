package com.example.ss6.repository;

import com.example.ss6.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {
    UserEntity findByUsername(String username);
    UserEntity findByToken(String token);
    UserEntity findByUsernameAndPassword(String username,String password);
}
