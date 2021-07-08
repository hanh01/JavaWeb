package com.example.movie.service;

import com.example.movie.entity.DirectorEntity;

import java.util.List;

public interface DirectorService {
    List<DirectorEntity> getDirector();
    DirectorEntity createDirector(DirectorEntity directorEntity);
}
