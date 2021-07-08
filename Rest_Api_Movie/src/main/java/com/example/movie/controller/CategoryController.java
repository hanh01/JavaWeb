package com.example.movie.controller;

import com.example.movie.entity.CategoryEntity;
import com.example.movie.entity.DirectorEntity;
import com.example.movie.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @ModelAttribute("list_category")
    public List<CategoryEntity> list(){
        return categoryService.getCategory();
    }

    @GetMapping({"/add-category"})
    public String detail(Model model) {
        CategoryEntity categoryEntity = new CategoryEntity();
        model.addAttribute("category", categoryEntity);
        return "add-category";
    }

    @PostMapping("/save-category")
    public String addCategory(@ModelAttribute CategoryEntity categoryEntity, Model model) {
        categoryService.createCategory(categoryEntity);
        return "redirect:/add-category";
    }
}
