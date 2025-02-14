package org.example;

public class Main {
    public static void main(String[] args) {

        try {
            int[] numeros = {5, 2, 8};
            System.out.println(numeros[0]);
            System.out.println(numeros[1]);
            System.out.println(numeros[2]);
            System.out.println(numeros[3]);
            System.out.println(":)");

        }catch (ArrayIndexOutOfBoundsException arrayE) {

            System.out.println("Esta intentando a una localidad que no está definida");
        }catch (Exception e) {
            System.out.println("Ocurrio este error: ");
            e.printStackTrace();
        }finally {
            System.out.println(":)");
        }


    }
}