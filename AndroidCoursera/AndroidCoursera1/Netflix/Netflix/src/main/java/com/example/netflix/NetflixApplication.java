package com.example.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class NetflixApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixApplication.class, args);

        ArrayList<Pelicula> peliculas = new ArrayList<>();
        ArrayList<Serie> series = new ArrayList<>();

        try {
            // Crear objetos de películas
            peliculas.add(new Pelicula("Inception", "Sci-Fi", "Christopher Nolan", "2010", 148));
            peliculas.add(new Pelicula("Titanic", "Romance", "James Cameron", "1997", 195));
            peliculas.add(new Pelicula("Avatar", "Sci-Fi", "James Cameron", "2009", 162));
            peliculas.add(new Pelicula("The Godfather", "Crime", "Francis Ford Coppola", "1972", 175));
            peliculas.add(new Pelicula("The Dark Knight", "Action", "Christopher Nolan", "2008", 152));

            // Crear objetos de series
            series.add(new Serie("Breaking Bad", 5, "Crime", "Vince Gilligan", 3000));
            series.add(new Serie("Stranger Things", 4, "Sci-Fi", "The Duffer Brothers", 2000));
            series.add(new Serie("Game of Thrones", 8, "Fantasy", "George R. R. Martin", 5000));
            series.add(new Serie("The Office", 9, "Comedy", "Greg Daniels", 2200));
            series.add(new Serie("Friends", 10, "Comedy", "David Crane", 3000));

            // Marcar como visto algunas películas y series
            peliculas.get(0).marcarVisto();
            peliculas.get(3).marcarVisto();
            series.get(2).marcarVisto();
            series.get(4).marcarVisto();

            // Mostrar las películas y series vistas
            System.out.println("Películas vistas:");
            peliculas.stream().filter(Pelicula::esVisto).forEach(System.out::println);

            System.out.println("\nSeries vistas:");
            series.stream().filter(Serie::esVisto).forEach(System.out::println);

            // Encontrar la serie con más temporadas y la película más reciente
            Serie serieConMasTemporadas = series.stream()
                    .max((s1, s2) -> Integer.compare(s1.getNroTemporadas(), s2.getNroTemporadas()))
                    .orElseThrow(() -> new Exception("No hay series disponibles"));

            Pelicula peliculaMasReciente = peliculas.stream()
                    .max((p1, p2) -> Integer.compare(Integer.parseInt(p1.getAnio()), Integer.parseInt(p2.getAnio())))
                    .orElseThrow(() -> new Exception("No hay películas disponibles"));

            System.out.println("\nSerie con más temporadas:");
            System.out.println(serieConMasTemporadas);

            System.out.println("\nPelícula más reciente:");
            System.out.println(peliculaMasReciente);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
