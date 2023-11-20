package com.virtual.libroservice.service;

import com.virtual.libroservice.model.Libro;
import com.virtual.libroservice.repository.LibroRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    public Optional<Libro> findById(Long id) {
        return libroRepository.findById(id);
    }

    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    public void deleteById(Long id) {
        libroRepository.deleteById(id);
    }

    // Aquí puedes agregar otros métodos según sea necesario, por ejemplo:
    // - Métodos para actualizar un libro existente
    // - Métodos para buscar libros por ciertos criterios
    // - Métodos para manejar la lógica de negocio relacionada con los libros
}
