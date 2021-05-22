package com.example.demo2.service;

import com.example.demo2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User findUser(int id);
    User createUser(User user);
    void deleteUser(int id);
    User updateUser(User user);
}
