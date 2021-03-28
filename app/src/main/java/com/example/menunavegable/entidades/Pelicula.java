package com.example.menunavegable.entidades;

public class Pelicula {
    private String titulo;
    private String argumento;
    private String foto;
    private String actores[];

    public Pelicula(String titulo, String argumento, String foto) {
        this.titulo = titulo;
        this.argumento = argumento;
        this.foto = foto;

    }

    public Pelicula(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }
}
