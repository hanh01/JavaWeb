package com.example.movie.repository;

import com.example.movie.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepo extends JpaRepository<DirectorEntity,Integer> {
}
