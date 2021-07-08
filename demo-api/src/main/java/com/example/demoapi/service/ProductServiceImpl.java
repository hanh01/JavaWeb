package com.example.demoapi.service;

import com.example.demoapi.entity.ProductEntity;
import com.example.demoapi.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity createProduct(ProductEntity productEntity) {
        return productRepo.save(productEntity);
    }
}
