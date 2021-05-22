package com.example.demo2.controller;

import com.example.demo2.model.User;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity getUser(){
        return ResponseEntity.ok(userService.getAllUser());
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User user){ //@RequestBody: lay tu raw cua postman
        User model = userService.createUser(user);
        return ResponseEntity.ok(model);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable ("id") int id, @RequestBody User user){ // @PathVariable : lay tu url in postman
        user.setId(id);
        User model = userService.updateUser(user);
        return ResponseEntity.ok(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable ("id") int id){
        userService.deleteUser(id);
        return ResponseEntity.ok("success");
    }
}
