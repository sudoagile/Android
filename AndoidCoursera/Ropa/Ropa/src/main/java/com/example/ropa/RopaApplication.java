package com.example.ropa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RopaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RopaApplication.class, args);
        Playera playera = new Playera(1, 200,"L","Gris","Cero");
        Jeans jeans = new Jeans(2,799,"32","Azul","Skinny",'F' );
        Calcetin calcetin = new Calcetin(3,50,"L", "Negro");

        playera.mostrarDatos("Playera Gris");
        jeans.mostrarDatos("Jeans Mujer");
        calcetin.mostrarDatos("Calcetines");

    }

}
