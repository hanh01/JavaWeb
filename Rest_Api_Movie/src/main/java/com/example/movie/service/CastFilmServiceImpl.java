package com.example.movie.service;

import com.example.movie.entity.CastsFilm;
import com.example.movie.repository.CastFilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastFilmServiceImpl implements CastFilmService {
    @Autowired
    CastFilmRepo castFilmRepo;

    @Override
    public List<CastsFilm> getAll() {
        return castFilmRepo.findAll();
    }

    @Override
    public CastsFilm addCast(CastsFilm castsFilm) {
        return castFilmRepo.save(castsFilm);
    }
}
