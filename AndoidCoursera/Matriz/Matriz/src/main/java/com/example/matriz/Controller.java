package com.example.matriz.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/api/matriz")
public class Controller {

    @GetMapping("/generar")
    public String generarMatriz(@RequestParam int filas, @RequestParam int columnas) {
        // Crear y llenar la matriz
        int[][] matriz = new int[filas][columnas];
        int valor = 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = valor++;
            }
        }

        // Formatear la matriz como una cadena estructurada
        StringBuilder matrizFormateada = new StringBuilder();
        for (int[] fila : matriz) {
            matrizFormateada.append(Arrays.toString(fila)).append("\n");
        }

        return matrizFormateada.toString();
    }
}
