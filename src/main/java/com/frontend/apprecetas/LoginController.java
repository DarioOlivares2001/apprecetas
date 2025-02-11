package com.frontend.apprecetas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                       @RequestParam(value = "logout", required = false) String logout,
                       Model model) {
        
        if (error != null) {
            model.addAttribute("error", "Usuario o contraseña inválidos.");
        }

        if (logout != null) {
            model.addAttribute("message", "Has cerrado sesión correctamente.");
        }

        return "login";
    }
    
    // Eliminamos el método home() de aquí ya que está en HomeController
}