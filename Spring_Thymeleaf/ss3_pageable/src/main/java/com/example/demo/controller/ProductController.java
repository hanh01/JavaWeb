package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.model.BaseModel;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    private ResponseEntity getProduct(@RequestParam(value = "page", defaultValue = "0", required = false) int page,
                                      @RequestParam(value = "limit", defaultValue = "20", required = false) int limit,
                                      @RequestParam(value = "name", required = false) String name) {
//        List<ProductEntity> list = productService.getAllProduct(PageRequest.of(page, limit));
        List<ProductEntity> list = productService.getProductByName(name,PageRequest.of(page,limit, Sort.by("price").descending()));
        BaseModel res = new BaseModel();
        res.data = list;
        return ResponseEntity.ok(res);
    }

}
