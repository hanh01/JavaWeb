package com.example.demoapi.controller;

import com.example.demoapi.entity.AttributeEntity;
import com.example.demoapi.entity.CategoryEntity;
import com.example.demoapi.entity.ProductEntity;
import com.example.demoapi.service.AttributeService;
import com.example.demoapi.service.CategoryService;
import com.example.demoapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    AttributeService attributeService;

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping({"/table"})
    public String table(Model model) {
        List<ProductEntity> products = productService.getAll();
        model.addAttribute("products", products);
        return "table";
    }

    @ModelAttribute("list_category")
    public List<CategoryEntity> list(){
        return categoryService.getCategory();
    }

    @ModelAttribute("list_attribute")
    public List<AttributeEntity> listAttribute(){
        return attributeService.getAttribute();
    }

    @GetMapping({"/add"})
    public String detail(Model model) {
        ProductEntity productEntity = new ProductEntity();
        model.addAttribute("product", productEntity);
        return "add-new-port";
    }

    @PostMapping("/save")
    public String addUser(@ModelAttribute ProductEntity productEntity, Model model) {
        productService.createProduct(productEntity);
        return "redirect:/table";
    }
}
