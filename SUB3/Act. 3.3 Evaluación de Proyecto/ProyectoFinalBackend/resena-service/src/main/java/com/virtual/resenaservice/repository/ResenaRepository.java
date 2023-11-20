package com.virtual.resenaservice.repository;

import com.virtual.resenaservice.model.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResenaRepository extends JpaRepository<Resena, Long> {
     
    List<Resena> findByLibroId(Long libroId);

}
