package com.example.dohonghanh.service;

import com.example.dohonghanh.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity addProduct(ProductEntity productEntity);
    ProductEntity updateProduct(ProductEntity p);
}
