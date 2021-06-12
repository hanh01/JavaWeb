package com.example.ss6.service;

import com.example.ss6.entity.TokenEntity;
import com.example.ss6.entity.UserEntity;
import com.example.ss6.repository.TokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    TokenRepo tokenRepo;

    @Override
    public UserEntity findUserByToken(String token) {
        TokenEntity tokenEntity = tokenRepo.findByToken(token);
        return tokenEntity.getUser();
    }

    @Override
    public TokenEntity createToken(int userID) {
        TokenEntity tokenEntity = new TokenEntity();
        String token = UUID.randomUUID().toString()+System.currentTimeMillis();
        tokenEntity.setToken(token);
        tokenEntity.setUserid(userID);
        tokenEntity.setExpire(30);
        return tokenRepo.save(tokenEntity);
    }
}
