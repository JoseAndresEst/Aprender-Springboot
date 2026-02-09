package com.joseandres.springdemo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHola {
    @GetMapping("/hola")
    public String hola() {
        return "hola desde spring";
    }
}
