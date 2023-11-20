package com.virtual.resenaservice.service;
import com.virtual.resenaservice.model.Resena;
import com.virtual.resenaservice.repository.ResenaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResenaService {

    private final ResenaRepository resenaRepository;

    public ResenaService(ResenaRepository resenaRepository) {
        this.resenaRepository = resenaRepository;
    }

    public List<Resena> findAll() {
        return resenaRepository.findAll();
    }

    public Resena save(Resena resena) {
        // Aquí podrías añadir lógica adicional antes de guardar la reseña
        return resenaRepository.save(resena);
    }

    // Método para buscar reseñas por el ID de un libro
    public List<Resena> findByLibroId(Long libroId) {
        return resenaRepository.findByLibroId(libroId);
    }

    

    // Otros métodos para actualizar, eliminar, y buscar reseñas
}
