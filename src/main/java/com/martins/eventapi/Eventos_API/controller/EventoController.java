package com.martins.eventapi.Eventos_API.controller;

import com.martins.eventapi.Eventos_API.model.Evento;
import com.martins.eventapi.Eventos_API.service.EventoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/all")
    public ResponseEntity<List<Evento>> getAllEventos() {
        List<Evento> eventos = eventoService.getAllEventos();
        return new ResponseEntity<>(eventos, HttpStatus.OK);
    }
}
