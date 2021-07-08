package com.example.movie.repository;

import com.example.movie.entity.CastsFilm;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface CastFilmRepo extends JpaRepository<CastsFilm, Integer> {
}
