package com.martins.eventapi.Eventos_API.service;

import com.martins.eventapi.Eventos_API.model.Evento;
import com.martins.eventapi.Eventos_API.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    // Instanciar repositório
    private EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    // Criar um novo evento
    public Evento addEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    // Mostrar eventos criados

    // Mostrar eventos por ID

    // Deletar eventos

    // Editar eventos

}
