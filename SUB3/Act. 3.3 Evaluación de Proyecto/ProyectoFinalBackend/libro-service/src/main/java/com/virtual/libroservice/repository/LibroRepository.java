package com.virtual.libroservice.repository;

import com.virtual.libroservice.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Aquí puedes definir métodos de búsqueda personalizados si es necesario
}
