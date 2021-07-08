package com.example.dohonghanh.repository;

import com.example.dohonghanh.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {
}
