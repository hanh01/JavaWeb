package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getProductByName(String name, Pageable pageable);
    List<ProductEntity> getAllProduct(Pageable pageable);
}
