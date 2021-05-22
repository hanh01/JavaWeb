package com.example.hanh.controller;

import com.example.hanh.entity.EmployeeEntity;
import com.example.hanh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<EmployeeEntity> employees = employeeService.getAll();
        model.addAttribute("employee", employees);
        return "index";
    }

    @RequestMapping({"/create"})
    public String createEmployee(Model model) {
        model.addAttribute("employee", new EmployeeEntity());
        return "createEmployee";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveProduct(EmployeeEntity employeeEntity) {
        employeeService.createEmployee(employeeEntity);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("sid") int id, Model model) {
        employeeService.deleteProduct(id);
        return "redirect:/";
    }

}
