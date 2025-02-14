package com.example.ropa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmartPhone extends Telefono implements IDevolucion{
    private String SIM;

    public SmartPhone(int id, double precio, String marca, String modelo, String SIM) {
        super(id, precio, marca, modelo);
        this.SIM = SIM;
    }


    @Override
    public void hacerDevolucion() {
        System.out.println("Devolucion de un SmartPhone");

    }
}
