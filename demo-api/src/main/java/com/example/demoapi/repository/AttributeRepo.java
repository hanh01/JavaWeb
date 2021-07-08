package com.example.demoapi.repository;

import com.example.demoapi.entity.AttributeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttributeRepo extends JpaRepository<AttributeEntity,Integer> {
}
