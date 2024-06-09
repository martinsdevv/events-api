package com.martins.eventapi.Eventos_API.repository;

import com.martins.eventapi.Eventos_API.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
