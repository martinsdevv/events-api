package com.martins.eventapi.Eventos_API.service;

import com.martins.eventapi.Eventos_API.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    // Instanciar repositório
    /*TODO: Refatorar a instância*/
    @Autowired
    private EventoRepository eventoRepository;

}
