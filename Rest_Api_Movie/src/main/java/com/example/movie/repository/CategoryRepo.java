package com.example.movie.repository;

import com.example.movie.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryEntity,Integer> {
}
