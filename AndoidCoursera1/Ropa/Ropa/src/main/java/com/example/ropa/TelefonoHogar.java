package com.example.ropa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelefonoHogar extends Telefono implements IDevolucion{

    private boolean alambrico;

    public TelefonoHogar(int id, double precio, String marca, String modelo, boolean alambrico) {
        super(id, precio, marca, modelo);
        this.alambrico = alambrico;
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolucion de un Telefono del Hogar");
    }
}
