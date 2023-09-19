package com.example.itassetpro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/usuario")
@Controller
public class UsuarioController {

    @GetMapping("/listar")
    public String listarUsuarios(){
        return "listarusuarios";
    }
}
