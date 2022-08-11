package com.cursospring.codegate.projetoaula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // diaz ao compilador que existe uma lista de caminhos no ficheiro
public class HomeController {

    @RequestMapping("/")
    public String homeApp(Model model){
        model.addAttribute("mensagem", "esta foi uma mensagem injetada através do model");
        return "index";
    }

}
