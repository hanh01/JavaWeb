package com.example.asignment.service;

import com.example.asignment.entity.StudentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentEntity> getAll();
    StudentEntity createUser(StudentEntity p);
    void deleteProduct(int id);
    Optional<StudentEntity> findUserById(int id);

    Page<StudentEntity> findAllByFirstNameContaining(String firstname, Pageable pageable);
    Page<StudentEntity> findAll(Pageable pageable);

    int getTotalPage(Pageable pageable);

}
