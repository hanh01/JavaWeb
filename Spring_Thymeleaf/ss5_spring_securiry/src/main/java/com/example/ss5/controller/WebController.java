package com.example.ss5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping({"/", "/index"})
    private String index(){
        return "index";
    }

    @GetMapping({"/admin"})
    private String admin(){
        return "admin";
    }

    @GetMapping({"/user"})
    private String user(){
        return "user";
    }

    @GetMapping({"/errorr"})
    private String error(){
        return "404";
    }

}
