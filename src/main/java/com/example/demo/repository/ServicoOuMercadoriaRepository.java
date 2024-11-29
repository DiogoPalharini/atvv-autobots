package com.example.demo.repository;

import com.example.demo.entity.ServicoOuMercadoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoOuMercadoriaRepository extends JpaRepository<ServicoOuMercadoria, Long> {
    // Adicione métodos personalizados, se necessário
}
