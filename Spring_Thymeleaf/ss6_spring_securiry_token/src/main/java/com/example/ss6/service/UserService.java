package com.example.ss6.service;

import com.example.ss6.entity.UserEntity;

public interface UserService {
    UserEntity login(String username, String password);
    UserEntity saveUser(UserEntity userEntity);
    UserEntity findUserByToken(String token);
    UserEntity findUserByUsername(String username);
}
