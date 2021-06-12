package com.example.ss6.repository;

import com.example.ss6.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepo extends JpaRepository<TokenEntity,Integer> {
    TokenEntity findByToken(String token);
}
