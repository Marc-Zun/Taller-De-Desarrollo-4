package com.virtual.resenaservice.controller;
import com.virtual.resenaservice.model.Resena;
import com.virtual.resenaservice.service.ResenaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/resenas")
public class ResenaController {

    private final ResenaService resenaService;

   
    public ResenaController(ResenaService resenaService) {
        this.resenaService = resenaService;
    }

    @GetMapping
    public ResponseEntity<List<Resena>> getAllResenas() {
        return ResponseEntity.ok(resenaService.findAll());
    }

     // Método para obtener reseñas por el ID de un libro
     @GetMapping("/por-libro")
     public ResponseEntity<List<Resena>> getResenasByLibroId(@RequestParam Long libroId) {
         List<Resena> resenas = resenaService.findByLibroId(libroId);
         return ResponseEntity.ok(resenas);
     }

    @PostMapping
    public ResponseEntity<Resena> createResena(@RequestBody Resena resena) {
        return ResponseEntity.ok(resenaService.save(resena));
    }

    // Agregar otros endpoints según sea necesario, como actualizar o eliminar reseñas
}
