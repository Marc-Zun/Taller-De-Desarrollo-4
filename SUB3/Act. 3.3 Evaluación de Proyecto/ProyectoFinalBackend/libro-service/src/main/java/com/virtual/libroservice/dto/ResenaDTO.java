package com.virtual.libroservice.dto;

public class ResenaDTO {
    private Long id;
    private String comentario;
    private Integer puntuacion;
    private Long libroId;  // ID del libro asociado a la reseña

    // Constructor por defecto
    public ResenaDTO() {
    }

    // Constructor con parámetros
    public ResenaDTO(Long id, String comentario, Integer puntuacion, Long libroId) {
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
