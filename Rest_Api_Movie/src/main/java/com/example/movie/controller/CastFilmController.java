package com.example.movie.controller;

import com.example.movie.entity.CastsEntity;
import com.example.movie.entity.CastsFilm;
import com.example.movie.entity.FilmEntity;
import com.example.movie.service.CastFilmService;
import com.example.movie.service.CastService;
import com.example.movie.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CastFilmController {
    @Autowired
    FilmService filmService;

    @Autowired
    CastFilmService castFilmService;

    @Autowired
    CastService castService;

    @ModelAttribute("list_film")
    public List<FilmEntity> listFilm() {
        return filmService.getAll();
    }

    @GetMapping({"/add-cast-film"})
    public String cast(Model model) {
        CastsFilm castsFilm = new CastsFilm();
        model.addAttribute("castsFilm", castsFilm);
        return "add-cast-film";
    }

    @PostMapping("/saveCast")
    public String saveCast(@ModelAttribute CastsFilm castsFilm, Model model) {
        castFilmService.addCast(castsFilm);
        return "redirect:/table";
    }

    @ModelAttribute("list_cast")
    public List<CastsEntity> listCast(){
        return castService.getCasts();
    }
}
