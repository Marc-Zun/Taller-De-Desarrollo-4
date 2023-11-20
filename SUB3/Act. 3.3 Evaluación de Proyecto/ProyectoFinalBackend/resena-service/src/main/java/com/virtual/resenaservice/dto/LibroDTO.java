package com.virtual.resenaservice.dto;

public class LibroDTO {
    private Long id;
    private String titulo;
    private String autor;
    private String sinopsis;
    private Integer anioPublicacion;

    // Constructor por defecto
    public LibroDTO() {
    }

    // Constructor con parámetros
    public LibroDTO(Long id, String titulo, String autor, String sinopsis, Integer anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
