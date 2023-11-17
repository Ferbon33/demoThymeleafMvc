package com.cursojava.clase13.controller;

import com.cursojava.clase13.entity.Estudiantes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controladores {
/*/
    @GetMapping("/Saludos")
    public String getStart(Model model){

        String saludo = "hola a todos";
        model.addAttribute("saludo",saludo);
        return "index";
    }

 */
    @GetMapping("/pagina")
    public String pagina(Model model){

        model.addAttribute("titulo","saludo");
        model.addAttribute("subtitulo","saludo");

        List<Estudiantes> lista = new ArrayList<>();

        lista.add(new Estudiantes(10,"maria","maria","docente"));
        lista.add(new Estudiantes(10,"maria","maria","docente"));
        lista.add(new Estudiantes(10,"maria","maria","docente"));
        lista.add(new Estudiantes(10,"maria","maria","docente"));

        model.addAttribute("lista_estudiantes",lista);
        return "index";
    }
}
