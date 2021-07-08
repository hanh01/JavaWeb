package com.example.demoapi.service;

import com.example.demoapi.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();
    ProductEntity createProduct(ProductEntity productEntity);
}
