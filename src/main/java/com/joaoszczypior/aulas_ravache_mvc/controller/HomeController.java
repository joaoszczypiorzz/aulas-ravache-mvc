package com.joaoszczypior.aulas_ravache_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute(
                "AulasRavacheMvc",
                "Locadora Drivenow"
        );
        model.addAttribute(
                "MensagemBoasVindas",
                "Gestão de Frotas e locação!"
        );
        return "index"; // templateS/index.html
    }
}
