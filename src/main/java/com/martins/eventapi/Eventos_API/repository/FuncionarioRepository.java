package com.martins.eventapi.Eventos_API.repository;

import com.martins.eventapi.Eventos_API.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
