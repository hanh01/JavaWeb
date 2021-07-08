package com.example.demoapi.controller;

import com.example.demoapi.dto.MapperDto;
import com.example.demoapi.entity.ProductEntity;
import com.example.demoapi.model.BaseResponse;
import com.example.demoapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.validation.Valid;

@RestController
public class WebController {

    @Autowired
    ProductService productService;

//    @Autowired
//    MapperDto mapperDto;

    @GetMapping("api/home")
    public ResponseEntity getProduct(){
        BaseResponse res = new BaseResponse();
        res.data = productService.getAll();
        return ResponseEntity.ok(res);
    }

    @PostMapping("api/product")
    public ResponseEntity createProduct(@RequestBody ProductEntity productEntity){
        BaseResponse res = new BaseResponse();
        res.data = productService.createProduct(productEntity);
        return ResponseEntity.ok(res);
    }

//    @PostMapping
//    private ResponseEntity createUser(@Valid @RequestBody UserDto userDto){
//        UserEntity userEntity = mapperDto.convertToEntity(userDto);
//        return ResponseEntity.ok(userService.create(userEntity));
//    }

}
