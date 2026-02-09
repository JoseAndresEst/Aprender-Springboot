package com.joseandres.springdemo.servicio;

import com.joseandres.springdemo.modelo.Pelicula;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPelicula {
    public List<Pelicula> obtenerPeliculas(){
        return List.of(
                new Pelicula("Torrente","Santiago Segura", 2002),
                new Pelicula("Harry Potter","Phillip Gloss", 2005)
        );
    }
}
