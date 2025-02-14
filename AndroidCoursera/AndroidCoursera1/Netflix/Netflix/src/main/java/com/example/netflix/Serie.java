package com.example.netflix;

public class Serie implements Visualizable {
    private String titulo;
    private int nroTemporadas = 1; // Por defecto 1
    private boolean visto = false; // Por defecto false
    private String genero;
    private String creador;
    private int duracion; // Duración total en minutos

    // Constructor default
    public Serie() {
    }

    // Constructor con título y creador
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    // Constructor con todos los atributos excepto 'visto'
    public Serie(String titulo, int nroTemporadas, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.nroTemporadas = nroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public int getNroTemporadas() {
        return nroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getDuracion() {
        return duracion;
    }

    // Métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNroTemporadas(int nroTemporadas) {
        this.nroTemporadas = nroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", nroTemporadas=" + nroTemporadas +
                ", visto=" + visto +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", duracion=" + duracion +
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
