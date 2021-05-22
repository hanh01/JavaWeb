package com.example.demo2.controller;

import com.example.demo2.entity.ProductEntity;
import com.example.demo2.model.BaseResponse;
import com.example.demo2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity getProduct(@RequestParam(value = "name", required = false) String name) {
        BaseResponse res = new BaseResponse();
        if (name != null){
            res.data = productService.getProductByName(name);
        }else {
            res.data = productService.getAll();
        }
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createProduct(@RequestBody ProductEntity p){
        ProductEntity data = productService.createProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody ProductEntity p){
        ProductEntity data = productService.updateProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable("id") int id) {
        BaseResponse res = new BaseResponse();
        productService.deleteProduct(id);
        return ResponseEntity.ok(res);
    }
}
