package com.example.ropa;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Ropa {

    private int id;
    private double precio;
    private String talla;
    private String color;

    public Ropa( int id, double precio, String talla, String color ) {
        this.id = id;
        this.precio = precio;
        this.talla = talla;
        this.color = color;


    }


    public void mostrarDatos(String nombreClase) {
        System.out.println(nombreClase);
        System.out.println("ID: " + id);
        System.out.println("Precio: " + precio);
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
    }
}
