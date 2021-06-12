package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.responsitory.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public List<UserEntity> getAll() {
        return userRepo.findAll();
    }

    @Override
    public UserEntity createUser(UserEntity p) {
        return userRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public Optional<UserEntity> findUserById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public List<UserEntity> getProductByName(String name, Pageable pageable) {
        return userRepo.findAllByName(name, pageable);
    }

    @Override
    public List<UserEntity> getAllProduct(Pageable pageable) {
        return userRepo.findAll(pageable).getContent();
    }


//    su dung page
    @Override
    public Page<UserEntity> findAll(Pageable pageable) {
        return userRepo.findAll(pageable);
    }

    @Override
    public Page<UserEntity> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return userRepo.findAllByNameContaining(firstname, pageable);
    }
}
