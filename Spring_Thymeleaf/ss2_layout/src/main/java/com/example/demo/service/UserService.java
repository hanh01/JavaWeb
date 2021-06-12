package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> getAll();
    UserEntity createUser(UserEntity p);
    void deleteProduct(int id);
    Optional<UserEntity> findUserById(int id);

    List<UserEntity> getProductByName(String name, Pageable pageable);
    List<UserEntity> getAllProduct(Pageable pageable);

    Page<UserEntity> findAll(Pageable pageable);
    Page<UserEntity> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
