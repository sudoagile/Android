package com.example.ropa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Telefono {
    private int id;
    private double precio;
    private String marca;
    private String modelo;

    public Telefono(int id, double precio, String marca, String modelo) {
        this.id = id;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }
}
