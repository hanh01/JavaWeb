package com.example.demo2.service;

import com.example.demo2.entity.ProductEntity;
import com.example.demo2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity createProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {
       productRepo.deleteById(id);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public List<ProductEntity> getProductByName(String name) {
        List<ProductEntity>list = productRepo.findProductByName(name);
        return list;
    }

    @Override
    public Optional<ProductEntity> findUserById(int id) {
        return productRepo.findById(id);
    }
}
