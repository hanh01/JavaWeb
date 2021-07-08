package com.example.movie.controller;

import com.example.movie.entity.CastsEntity;
import com.example.movie.entity.CategoryEntity;
import com.example.movie.entity.DirectorEntity;
import com.example.movie.service.CastService;
import com.example.movie.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CastController {
    @Autowired
    CastService castService;

    @ModelAttribute("list_cast")
    public List<CastsEntity> list(){
        return castService.getCasts();
    }

    @GetMapping({"/add-cast"})
    public String detail(Model model) {
        CastsEntity castsEntity = new CastsEntity();
        model.addAttribute("cast", castsEntity);
        return "add-cast";
    }

    @PostMapping("/save-cast")
    public String addCategory(@ModelAttribute CastsEntity castsEntity, Model model) {
        castService.createCast(castsEntity);
        return "redirect:/add-cast";
    }
}
