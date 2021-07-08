package com.example.movie.service;

import com.example.movie.entity.DirectorEntity;
import com.example.movie.repository.DirectorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService{
    @Autowired
    DirectorRepo directorRepo;

    @Override
    public List<DirectorEntity> getDirector() {
        return directorRepo.findAll();
    }

    @Override
    public DirectorEntity createDirector(DirectorEntity directorEntity) {
        return directorRepo.save(directorEntity);
    }
}
