package com.example.movie.service;

import com.example.movie.entity.CategoryEntity;
import com.example.movie.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<CategoryEntity> getCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public CategoryEntity createCategory(CategoryEntity categoryEntity) {
        return categoryRepo.save(categoryEntity);
    }
}
