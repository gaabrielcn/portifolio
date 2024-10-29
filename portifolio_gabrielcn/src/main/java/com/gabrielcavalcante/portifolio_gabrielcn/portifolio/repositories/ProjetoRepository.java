package com.exemplo.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.portfolio.models.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
