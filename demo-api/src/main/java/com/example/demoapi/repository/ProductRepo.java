package com.example.demoapi.repository;

import com.example.demoapi.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {
}
