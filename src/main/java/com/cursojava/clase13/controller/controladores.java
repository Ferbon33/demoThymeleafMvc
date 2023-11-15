package com.cursojava.clase13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controladores {

    @GetMapping("/Saludos")
    public String getStart(Model model){

        String saludo = "hola a todos";
        model.addAttribute("saludo",saludo);
        return "index";
    }
}
