package com.example.movie.service;

import com.example.movie.entity.CategoryEntity;
import com.example.movie.entity.DirectorEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryEntity> getCategory();
    CategoryEntity createCategory(CategoryEntity categoryEntity);
}
