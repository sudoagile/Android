package com.example.netflix;

public class Pelicula implements Visualizable {
    private String titulo;
    private String genero;
    private String creador;
    private String anio;
    private int duracion; // en minutos
    private boolean visto = false; // Por defecto false

    // Constructor default
    public Pelicula() {
    }

    // Constructor con título y creador
    public Pelicula(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    // Constructor con todos los atributos excepto 'visto'
    public Pelicula(String titulo, String genero, String creador, String anio, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.anio = anio;
        this.duracion = duracion;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public String getAnio() {
        return anio;
    }

    public int getDuracion() {
        return duracion;
    }

    // Métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", anio='" + anio + '\'' +
                ", duracion=" + duracion +
                ", visto=" + visto +
                '}';
    }

    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public boolean esVisto() {
        return visto;
    }

    @Override
    public int tiempoVisto() {
        return duracion; // Retorna el tiempo total en minutos
    }
}
