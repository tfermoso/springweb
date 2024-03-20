package com.ceica.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {
    @GetMapping("/")
    public String index(Model model) {
        String nombre = "Tomas";
        model.addAttribute("name", nombre);
        return "index";
    }

    @PostMapping("/")
    public String login(@RequestParam String nombre, @RequestParam String password, Model model) {
        if (nombre.equals("admin") & password.equals("1234")) {
            return "redirect:/admin";
        } else {
            model.addAttribute("msg", "Usuario o Contraseña incorrecta");
            return "index";
        }


    }
    @PostMapping("/tarea")
    public String creartarea(@ModelAttribute Tarea tarea) {
        System.out.println(tarea);
        return "index";
    }
}
