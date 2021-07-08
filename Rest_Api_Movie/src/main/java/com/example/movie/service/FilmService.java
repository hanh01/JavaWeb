package com.example.movie.service;

import com.example.movie.entity.FilmEntity;

import java.util.List;

public interface FilmService {
    List<FilmEntity> getAll();
    FilmEntity createFilm(FilmEntity filmEntity);
}
