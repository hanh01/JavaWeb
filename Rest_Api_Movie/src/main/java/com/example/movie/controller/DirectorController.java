package com.example.movie.controller;

import com.example.movie.entity.CategoryEntity;
import com.example.movie.entity.DirectorEntity;
import com.example.movie.entity.FilmEntity;
import com.example.movie.service.CategoryService;
import com.example.movie.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DirectorController {
    @Autowired
    DirectorService directorService;

    @ModelAttribute("list_director")
    public List<DirectorEntity> list(){
        return directorService.getDirector();
    }

    @GetMapping({"/add-director"})
    public String detail(Model model) {
        DirectorEntity directorEntity = new DirectorEntity();
        model.addAttribute("director", directorEntity);
        return "add-director";
    }

    @PostMapping("/save-director")
    public String addDirector(@ModelAttribute DirectorEntity directorEntity, Model model) {
        directorService.createDirector(directorEntity);
        return "redirect:/add-director";
    }
}
