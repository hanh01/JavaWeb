package com.example.hanh.service;

import com.example.hanh.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> getAll();
    EmployeeEntity createEmployee(EmployeeEntity p);
    void deleteProduct(int id);
    EmployeeEntity updateProduct(EmployeeEntity p);
    List<EmployeeEntity> getProductByName(String name);
    Optional<EmployeeEntity> findUserById(int id);
}
