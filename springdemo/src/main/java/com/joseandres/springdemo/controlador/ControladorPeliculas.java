package com.joseandres.springdemo.controlador;

import com.joseandres.springdemo.modelo.Pelicula;
import com.joseandres.springdemo.servicio.ServicioPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorPeliculas {
    @Autowired
    private ServicioPelicula servicioPelicula;

    @GetMapping("/peliculas")
    public List<Pelicula> ontenerPeliculas(){
        return servicioPelicula.obtenerPeliculas();
    }
}
