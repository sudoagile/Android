package com.example.ropa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RopaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RopaApplication.class, args);
        Playera playera = new Playera(1, 200,"L","Gris","Cero");
        PlayeraPersonalizada playeraPersonalizada = new PlayeraPersonalizada(4, 450, "M", "Negro","@erdl" );
        Jeans jeans = new Jeans(2,799,"32","Azul","Skinny",'F' );
        Calcetin calcetin = new Calcetin(3,50,"L", "Negro");

        playera.mostrarDatos("Playera Gris");
        playeraPersonalizada.mostrarDatos("Playera de @erdl");
        jeans.mostrarDatos("Jeans Mujer");
        calcetin.mostrarDatos("Calcetines");
        playera.hacerDevolucion();
        jeans.hacerDevolucion();

        SmartPhone smartPhone = new SmartPhone(5,5667, "Samsung", "Galaxy", "Aguna Telefonica");
        smartPhone.hacerDevolucion();
    }

}
