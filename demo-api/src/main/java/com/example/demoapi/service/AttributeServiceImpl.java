package com.example.demoapi.service;

import com.example.demoapi.entity.AttributeEntity;
import com.example.demoapi.repository.AttributeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    AttributeRepo attributeRepo;

    @Override
    public List<AttributeEntity> getAttribute() {
        return attributeRepo.findAll();
    }
}
