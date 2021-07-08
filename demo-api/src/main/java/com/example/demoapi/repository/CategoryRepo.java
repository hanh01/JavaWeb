package com.example.demoapi.repository;

import com.example.demoapi.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryEntity,Integer> {
}
