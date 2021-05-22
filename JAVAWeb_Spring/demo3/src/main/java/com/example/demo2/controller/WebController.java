package com.example.demo2.controller;

import com.example.demo2.entity.ProductEntity;
import com.example.demo2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class WebController {
    @Autowired
    ProductService productService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        String msg = "Hello Spring Boot + JSP";
        model.addAttribute("msg", msg);
        List<ProductEntity> products = productService.getAll();
        model.addAttribute("products", products);
        return "index";
    }

    @RequestMapping({"/create"})
    public String create(Model model) {
        model.addAttribute("product", new ProductEntity());
        return "create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveProduct(ProductEntity productEntity) {
        productService.createProduct(productEntity);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("sid") int id, Model model) {
        productService.deleteProduct(id);
        return "redirect:/";
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editUser(@RequestParam("sid") int id, Model model) {
        Optional<ProductEntity> userEdit = productService.findUserById(id);
        userEdit.ifPresent(user -> model.addAttribute("productss", user));
        return "edit";
    }


}

