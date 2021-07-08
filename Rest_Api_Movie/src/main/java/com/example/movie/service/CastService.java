package com.example.movie.service;

import com.example.movie.entity.CastsEntity;
import com.example.movie.entity.CategoryEntity;

import java.util.List;

public interface CastService {
    List<CastsEntity> getCasts();
    CastsEntity createCast(CastsEntity castsEntity);
}
