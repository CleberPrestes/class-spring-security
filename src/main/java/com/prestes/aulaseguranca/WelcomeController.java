package com.prestes.aulaseguranca;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String Welcome(){
        return "Bem vindo a minha api Spring Boot";
    }

    @GetMapping("/users")
   // @PreAuthorize("hasAnyRole('MANAGERS', 'USERS')")
    public String users(){
        return "Usuario Autorizado";
    }

    @GetMapping("/managers")
   // @PreAuthorize("hasRole('MANAGERS')")
    public String managers(){
        return "Gerenciador Autoriazado";
    }
}
