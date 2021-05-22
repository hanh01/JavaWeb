package com.example.demo2.service;

import com.example.demo2.datasource.Datasource;
import com.example.demo2.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> listUser = Datasource.getListUser();

    @Override
    public List<User> getAllUser() {
        return listUser;
    }

    @Override
    public User createUser(User user) {
        listUser.add(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        for(User model : listUser){
            if(model.getId() == id){
                listUser.remove(model);
            }
        }
    }

    @Override
    public User updateUser(User user) {
        for(User model : listUser){
            if(model.getId() == user.getId()){
                model.setName(user.getName());
                model.setPhone(user.getPhone());
                model.setAge(user.getAge());
            }
        }
        return user;
    }

    @Override
    public User findUser(int id) {
        for(User user : listUser){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
