package com.example.ss8.controller;

import com.example.ss8.dto.MapperDto;
import com.example.ss8.dto.UserDto;
import com.example.ss8.entity.UserEntity;
import com.example.ss8.service.UserService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

   @Autowired
   MapperDto mapperDto;

    @GetMapping
    private ResponseEntity getUser(){
        List<UserEntity> list = userService.getAllUser();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    private ResponseEntity createUser(@Valid @RequestBody UserDto userDto){
        UserEntity userEntity = mapperDto.convertToEntity(userDto);
        return ResponseEntity.ok(userService.create(userEntity));
    }

}
