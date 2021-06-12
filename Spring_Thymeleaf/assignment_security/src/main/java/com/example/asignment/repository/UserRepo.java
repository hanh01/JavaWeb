package com.example.asignment.repository;

import com.example.asignment.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {
    UserEntity findByUsername(String username);
}
