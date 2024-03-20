package com.ceica.springweb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Devuelve el nombre de la vista del formulario de login
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password) {
        // Aquí puedes manejar la lógica de autenticación
        // Por ejemplo, puedes autenticar al usuario utilizando Spring Security
        // Después de la autenticación, puedes redirigir al usuario a una página de inicio o a otra página según sea necesario
        return "redirect:/home";
    }
}
