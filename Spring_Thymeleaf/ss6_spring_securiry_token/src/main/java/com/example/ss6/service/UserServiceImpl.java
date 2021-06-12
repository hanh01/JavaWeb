package com.example.ss6.service;

import com.example.ss6.entity.TokenEntity;
import com.example.ss6.entity.UserEntity;
import com.example.ss6.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    TokenService tokenService;

    @Override
    public UserEntity login(String username, String password) {
        UserEntity user = userRepo.findByUsername(username);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (encoder.matches(password, user.getPassword())) {
            TokenEntity s = tokenService.createToken(user.getId());
            user.setToken(s.getToken());
            return user;
        }
        return null;
    }

    @Override
    public UserEntity findUserByToken(String token) {
        return userRepo.findByToken(token);
    }

    @Override
    public UserEntity findUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }


    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String passEncode = encoder.encode(userEntity.getPassword());
        userEntity.setPassword(passEncode);
        UserEntity user = userRepo.save(userEntity);
        TokenEntity s = tokenService.createToken(user.getId());
        user.setToken(s.getToken());
        return user;
    }
}
