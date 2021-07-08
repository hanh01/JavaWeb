package com.example.movie.repository;

import com.example.movie.entity.CastsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CastRepo extends JpaRepository<CastsEntity,Integer> {
}
