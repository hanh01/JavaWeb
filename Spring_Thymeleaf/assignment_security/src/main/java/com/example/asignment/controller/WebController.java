package com.example.asignment.controller;

import com.example.asignment.entity.StudentEntity;
import com.example.asignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    StudentService studentService;

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping({"/login"})
    public String login() {
        return "login";
    }

    @GetMapping("/table")
    public ModelAndView listUser(@RequestParam("username") Optional<String> s, Pageable pageable,Model model,  @RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size) {
        Page<StudentEntity> users;
        if(s.isPresent()){
            users = studentService.findAllByFirstNameContaining(s.get(), pageable);
        } else {
            int totalPage  = studentService.getTotalPage(PageRequest.of(page, size));
            model.addAttribute("totalPage", totalPage);
            model.addAttribute("size", size);
            model.addAttribute("page", page);
            users = studentService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("table");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

//    @GetMapping({"/table"})
//    public String table(Model model) {
//        List<StudentEntity> users = studentService.getAll();
//        model.addAttribute("users", users);
//        return "table";
//    }

    @GetMapping({"/chart"})
    public String chart() {
        return "chart";
    }

    @GetMapping({"/add"})
    public String add(Model model) {
        StudentEntity studentEntity = new StudentEntity();
        model.addAttribute("student", studentEntity);
        return "add";
    }

    @PostMapping({"/save"})
    public String save(@ModelAttribute StudentEntity studentEntity, Model model) {
        studentService.createUser(studentEntity);
        return "redirect:/table";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, Model model) {
        studentService.deleteProduct(id);
        return "redirect:/table";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        Optional<StudentEntity> userEdit = studentService.findUserById(id);
        userEdit.ifPresent(user -> model.addAttribute("student", user));
        return "edit";
    }

    @GetMapping({"/errorr"})
    private String error(){
        return "404";
    }
}
