package com.example.dohonghanh.service;

import com.example.dohonghanh.entity.ProductEntity;
import com.example.dohonghanh.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity addProduct(ProductEntity productEntity) {
        return productRepo.save(productEntity);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity p) {
        return productRepo.save(p);
    }
}
