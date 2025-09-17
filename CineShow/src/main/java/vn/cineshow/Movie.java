package vn.cineshow;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private LocalDate releaseDate;
    String abd;
String  al;
    // Getters, setters, constructors (dùng Lombok nếu muốn)
}
