package com.example.movie.controller;

import com.example.movie.model.BaseResponse;
import com.example.movie.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {
    @Autowired
    FilmService filmService;

    @GetMapping("/api/movie")
    public ResponseEntity getFilm(){
        BaseResponse res = new BaseResponse();
        res.data = filmService.getAll();
        return ResponseEntity.ok(res);
    }
}
