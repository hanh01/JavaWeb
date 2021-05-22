package com.example.hanh.controller;

import com.example.hanh.entity.EmployeeEntity;
import com.example.hanh.model.BaseResponse;
import com.example.hanh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity getUser(@RequestParam(value = "name", required = false) String name) {
        BaseResponse res = new BaseResponse();
        if (name != null){
            res.data = employeeService.getProductByName(name);
        }else {
            res.data = employeeService.getAll();
        }
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createEmployee(@RequestBody EmployeeEntity p){
        EmployeeEntity data = employeeService.createEmployee(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @PutMapping
    public ResponseEntity updateEmployee(@RequestBody EmployeeEntity p){
        EmployeeEntity data = employeeService.updateProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable("id") int id) {
        BaseResponse res = new BaseResponse();
        employeeService.deleteProduct(id);
        return ResponseEntity.ok(res);
    }


}
