package com.example.movie.controller;

import com.example.movie.entity.*;
import com.example.movie.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    FilmService filmService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    CastService castService;

    @Autowired
    DirectorService directorService;

    @Autowired
    CastFilmService castFilmService;

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping({"/table"})
    public String table(Model model) {
        List<FilmEntity> films = filmService.getAll();
        model.addAttribute("films", films);
        return "table";
    }

    @GetMapping({"/add"})
    public String detail(Model model) {
        FilmEntity filmEntity = new FilmEntity();
        model.addAttribute("film", filmEntity);
        return "add-new-port";
    }

    @PostMapping("/save")
    public String addUser(@ModelAttribute FilmEntity filmEntity, Model model) {
        filmService.createFilm(filmEntity);
        return "redirect:/table";
    }


    @ModelAttribute("list_category")
    public List<CategoryEntity> listCategory(){
        return categoryService.getCategory();
    }

    @ModelAttribute("list_cast")
    public List<CastsEntity> listCast(){
        return castService.getCasts();
    }

    @ModelAttribute("list_director")
    public List<DirectorEntity> list(){
        return directorService.getDirector();
    }


}
