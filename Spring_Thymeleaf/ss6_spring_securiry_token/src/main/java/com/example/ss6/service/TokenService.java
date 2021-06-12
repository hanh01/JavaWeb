package com.example.ss6.service;

import com.example.ss6.entity.TokenEntity;
import com.example.ss6.entity.UserEntity;

public interface TokenService {
    UserEntity findUserByToken(String token);
    TokenEntity createToken(int userID);

}
