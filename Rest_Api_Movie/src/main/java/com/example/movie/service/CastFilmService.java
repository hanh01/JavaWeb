package com.example.movie.service;

import com.example.movie.entity.CastsFilm;

import java.util.List;

public interface CastFilmService {
    List<CastsFilm> getAll();
    CastsFilm addCast(CastsFilm castsFilm);
}
