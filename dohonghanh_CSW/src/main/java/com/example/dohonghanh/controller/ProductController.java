package com.example.dohonghanh.controller;

import com.example.dohonghanh.dto.MapperDto;
import com.example.dohonghanh.dto.ProductDto;
import com.example.dohonghanh.entity.ProductEntity;
import com.example.dohonghanh.model.BaseResponse;
import com.example.dohonghanh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    MapperDto mapperDto;

    @GetMapping
    public ResponseEntity getAllProducts(){
        BaseResponse res = new BaseResponse();
        res.data = productService.getAllProducts();
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody ProductDto productDto){
        BaseResponse res = new BaseResponse();
        ProductEntity productEntity = mapperDto.convertToEntity(productDto);
        res.data = productService.addProduct(productEntity);
        return ResponseEntity.ok(res);
    }

    @PutMapping("/{id}")
    public ResponseEntity sellProduct(@PathVariable ("id") int id,@RequestBody ProductDto productDto){
        ProductEntity p = mapperDto.convertToEntity(productDto);
        p.setId(id);
        ProductEntity data = productService.updateProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }
}
