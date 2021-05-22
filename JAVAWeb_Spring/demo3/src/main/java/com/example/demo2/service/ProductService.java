package com.example.demo2.service;

import com.example.demo2.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductEntity> getAll();
    ProductEntity createProduct(ProductEntity p);
    void deleteProduct(int id);
    ProductEntity updateProduct(ProductEntity p);
    List<ProductEntity> getProductByName(String name);
    Optional<ProductEntity> findUserById(int id);
}
