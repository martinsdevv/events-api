package com.martins.eventapi.Eventos_API.controller;

import com.martins.eventapi.Eventos_API.model.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/eventos")
public class EventoViewController {

    private final RestTemplate restTemplate;

    public EventoViewController() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping("/novo")
    public String showNewEventoForm(Model model) {
        model.addAttribute("evento", new Evento());
        return "addevento";
    }

    @PostMapping("/addevento")
    public String addEvento(@ModelAttribute Evento evento) {
        restTemplate.postForEntity("http://localhost:8080/api/eventos/addevento", evento, Evento.class);
        return "redirect:/eventos/all";
    }

    @GetMapping("/all")
    public String getAllEventos(Model model) {
        List<Evento> eventos = restTemplate.getForObject("http://localhost:8080/api/eventos/all", List.class);
        model.addAttribute("eventos", eventos);
        return "eventos";
    }
}
