package com.example.ss8.service;

import com.example.ss8.dto.UserDto;
import com.example.ss8.entity.UserEntity;
import com.example.ss8.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;


    @Override
    public List<UserEntity> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public UserEntity create(UserEntity userEntity) {
        return userRepo.save(userEntity);
    }
}
