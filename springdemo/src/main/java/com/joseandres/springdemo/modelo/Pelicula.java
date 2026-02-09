package com.joseandres.springdemo.modelo;

public class Pelicula {
    private String titulo;
    private String director;
    private int ano_estreno;

    public Pelicula(String titulo, String director, int ano_estreno) {
        this.titulo = titulo;
        this.director = director;
        this.ano_estreno = ano_estreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAno_estreno() {
        return ano_estreno;
    }

    public void setAno_estreno(int ano_estreno) {
        this.ano_estreno = ano_estreno;
    }
}
