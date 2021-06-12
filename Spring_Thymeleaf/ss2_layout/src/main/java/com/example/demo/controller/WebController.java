package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/table")
    public ModelAndView listUser(@RequestParam("username") Optional<String> s, Pageable pageable) {
        Page<UserEntity> users;
        if(s.isPresent()){
            users = userService.findAllByFirstNameContaining(s.get(), pageable);
        } else {
            users = userService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("table");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

//    @GetMapping({"/table"})
//    public String table(Model model) {
//        List<UserEntity> users = userService.getAll();
//        model.addAttribute("users", users);
//        return "table";
//    }

    @GetMapping({"/add"})
    public String detail(Model model) {
        UserEntity userEntity = new UserEntity();
        model.addAttribute("user", userEntity);
        return "add-new-port";
    }

    @PostMapping("/save")
    public String addUser(@ModelAttribute UserEntity userEntity, Model model) {
        userService.createUser(userEntity);
        return "redirect:/table";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, Model model) {
        userService.deleteProduct(id);
        return "redirect:/table";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        Optional<UserEntity> userEdit = userService.findUserById(id);
        userEdit.ifPresent(user -> model.addAttribute("user", user));
        return "update";
    }


    @GetMapping({"/user_profile"})
    public String user() {
        return "user-profile";
    }

}
