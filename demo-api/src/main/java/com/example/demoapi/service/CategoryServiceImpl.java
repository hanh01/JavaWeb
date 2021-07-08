package com.example.demoapi.service;

import com.example.demoapi.entity.CategoryEntity;
import com.example.demoapi.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo caegoryRepo;

    @Override
    public List<CategoryEntity> getCategory() {
        return caegoryRepo.findAll();
    }
}
