package com.example.asignment.repository;

import com.example.asignment.entity.StudentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {
    Page<StudentEntity> findAllByUsername(String firstname, Pageable pageable);
}
