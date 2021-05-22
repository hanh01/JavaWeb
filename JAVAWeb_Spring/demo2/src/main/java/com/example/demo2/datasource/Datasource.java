package com.example.demo2.datasource;

import com.example.demo2.model.User;

import java.util.ArrayList;
import java.util.List;

public class Datasource {
    private static List<User> listUser;

    public static List<User> getListUser(){
        if(listUser == null){
            listUser = new ArrayList<>();
            for(int i = 1; i <10; i++){
                User user = new User(i,"fpt" + i, "01234567"+i,20+i );
                listUser.add(user);
            }
        }
        return listUser;
    }
}
