package com.virtual.libroservice.controller;

import com.virtual.libroservice.dto.ResenaDTO;
import com.virtual.libroservice.model.Libro;
import com.virtual.libroservice.service.LibroService;
import com.virtual.libroservice.service.ResenaClientService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService libroService;
    private final ResenaClientService resenaClientService;

    public LibroController(LibroService libroService, ResenaClientService resenaClientService) {
        this.libroService = libroService;
        this.resenaClientService = resenaClientService;
    }

    // Obtener todos los libros
    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.findAll();
    }

    @GetMapping("/{id}/resenas")
    public ResponseEntity<List<ResenaDTO>> getResenasForLibro(@PathVariable Long id) {
        List<ResenaDTO> resenas = resenaClientService.getResenasForLibro(id);
        return ResponseEntity.ok(resenas);
    }

    // Obtener un libro por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Libro> getLibroById(@PathVariable Long id) {
        return libroService.findById(id)
                .map(libro -> ResponseEntity.ok(libro))
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear un nuevo libro
    @PostMapping
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    // Actualizar un libro existente
    @PutMapping("/{id}")
    public ResponseEntity<Libro> updateLibro(@PathVariable Long id, @RequestBody Libro libroDetails) {
        return libroService.findById(id)
                .map(libro -> {
                    libro.setTitulo(libroDetails.getTitulo());
                    libro.setAutor(libroDetails.getAutor());
                    libro.setSinopsis(libroDetails.getSinopsis());
                    libro.setAnioPublicacion(libroDetails.getAnioPublicacion());
                    Libro updatedLibro = libroService.save(libro);
                    return ResponseEntity.ok(updatedLibro);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar un libro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibro(@PathVariable Long id) {
        return libroService.findById(id)
                .map(libro -> {
                    libroService.deleteById(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
