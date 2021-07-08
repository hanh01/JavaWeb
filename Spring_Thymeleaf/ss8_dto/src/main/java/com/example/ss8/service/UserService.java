package com.example.ss8.service;

import com.example.ss8.dto.UserDto;
import com.example.ss8.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUser();
    UserEntity create(UserEntity userEntity);
}
