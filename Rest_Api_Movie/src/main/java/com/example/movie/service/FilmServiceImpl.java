package com.example.movie.service;

import com.example.movie.entity.FilmEntity;
import com.example.movie.repository.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmRepo filmRepo;

    @Override
    public List<FilmEntity> getAll() {
        return filmRepo.findAll();
    }

    @Override
    public FilmEntity createFilm(FilmEntity filmEntity) {
        return filmRepo.save(filmEntity);
    }
}
