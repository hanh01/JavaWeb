package com.example.movie.service;

import com.example.movie.entity.CastsEntity;
import com.example.movie.repository.CastRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastServiceImpl implements CastService {
    @Autowired
    CastRepo castRepo;

    @Override
    public List<CastsEntity> getCasts() {
        return castRepo.findAll();
    }

    @Override
    public CastsEntity createCast(CastsEntity castsEntity) {
        return castRepo.save(castsEntity);
    }
}
