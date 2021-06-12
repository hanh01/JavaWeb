package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.BaseModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class WebController {
    @Autowired
    UserService userService;

    @GetMapping({"/", "index"})
    public String index(Model model) {
        String mes = "Hello Spring boot + thymeleaf";
        model.addAttribute("message", mes);
        return "index";
    }

    @GetMapping("/adduser")
    public String addUser(Model model) {
        UserEntity userEntity = new UserEntity();
        model.addAttribute("user", userEntity);
        return "adduser";
    }

    @GetMapping("/listuser")
    public ModelAndView listUser(@RequestParam("s") Optional<String> s,Pageable pageable) {
        Page<UserEntity> users;
        if(s.isPresent()){
            users = userService.findAllByFirstNameContaining(s.get(), pageable);
        } else {
            users = userService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("listuser");
        modelAndView.addObject("users", users);
        return modelAndView;
    }


//    @GetMapping("/listuser")
//    public String listUser(Model model) {
//        List<UserEntity> users = userService.getAll();
//        model.addAttribute("users", users);
//        return "listuser";
//    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute UserEntity userEntity, Model model) {
        userService.createUser(userEntity);
        return "redirect:/listuser";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, Model model) {
        userService.deleteProduct(id);
        return "redirect:/listuser";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        Optional<UserEntity> userEdit = userService.findUserById(id);
        userEdit.ifPresent(user -> model.addAttribute("user", user));
        return "edituser";
    }



    //    phan trang voi postman
//    @GetMapping("api/user")
//    private ResponseEntity getProduct(@RequestParam(value = "page", defaultValue = "1", required = false) int page,
//                                      @RequestParam(value = "limit", defaultValue = "20", required = false) int limit,
//                                      @RequestParam(value = "name", required = false) String name) {
////        List<ProductEntity> list = productService.getAllProduct(PageRequest.of(page, limit));
//        List<UserEntity> list = userService.getProductByName(name, PageRequest.of(page,limit, Sort.by("age").descending()));
//        BaseModel res = new BaseModel();
//        res.data = list;
//        return ResponseEntity.ok(res);
//    }

}
