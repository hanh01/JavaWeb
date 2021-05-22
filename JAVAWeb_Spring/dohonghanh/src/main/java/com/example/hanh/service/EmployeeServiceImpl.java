package com.example.hanh.service;

import com.example.hanh.entity.EmployeeEntity;
import com.example.hanh.respository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<EmployeeEntity> getAll() {
        return productRepo.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity p) {
        return productRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public EmployeeEntity updateProduct(EmployeeEntity p) {
        return productRepo.save(p);
    }

    @Override
    public List<EmployeeEntity> getProductByName(String name) {
        List<EmployeeEntity>list = productRepo.findProductByName(name);
        return list;
    }

    @Override
    public Optional<EmployeeEntity> findUserById(int id) {
        return productRepo.findById(id);
    }
}
