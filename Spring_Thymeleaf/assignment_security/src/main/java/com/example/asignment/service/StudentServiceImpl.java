package com.example.asignment.service;

import com.example.asignment.entity.StudentEntity;
import com.example.asignment.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<StudentEntity> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity createUser(StudentEntity p) {
        return studentRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Optional<StudentEntity> findUserById(int id) {
        return studentRepo.findById(id);
    }

    @Override
    public Page<StudentEntity> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return studentRepo.findAllByUsername(firstname, pageable);
    }

    @Override
    public Page<StudentEntity> findAll(Pageable pageable) {
        return studentRepo.findAll(pageable);
    }

    @Override
    public int getTotalPage(Pageable pageable) {
        return studentRepo.findAll(pageable).getTotalPages();
    }


}
