package com.example.movie.repository;

import com.example.movie.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<FilmEntity,Integer> {
}
