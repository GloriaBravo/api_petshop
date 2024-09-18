package com.petShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundo {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola Mundo ADSO";
    }

    @GetMapping("/adios")
    public String adios(){
        return " Nos vemos ADSO";
    }
}
