package com.martins.eventapi.Eventos_API.controller;

import com.martins.eventapi.Eventos_API.model.Evento;
import com.martins.eventapi.Eventos_API.service.EventoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    private EventoService eventoService;
    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    // POST
    @PostMapping("/addevento")
    public ResponseEntity<Evento> addEvento(@RequestBody Evento evento) {
        Evento newEvento = eventoService.addEvento(evento);
        return new ResponseEntity<>(newEvento, HttpStatus.CREATED);
    }

    // GET

}
