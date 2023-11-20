package com.virtual.resenaservice.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comentario;
    private Integer puntuacion;
    private Long libroId; // ID del libro en el microservicio de libros

    // Constructor por defecto
    public Resena() {
    }

    // Constructor con parámetros
    public Resena(Long id, String comentario, Integer puntuacion, Long libroId) {
        this.id = id;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
        this.libroId = libroId;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }
}
