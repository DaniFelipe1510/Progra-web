/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.controller;


import com.ITicket.entity.Lugar;
import com.ITicket.entity.Evento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.ITicket.service.ILugarService;
import com.ITicket.service.IEventoService;


@Controller
public class EventoController {

    @Autowired
    private IEventoService eventoService;

    @Autowired
    private ILugarService lugarService;

    @GetMapping("/evento")
    public String index(Model model) {
        List<Evento> listaEvento = eventoService.getAllEvento();
        model.addAttribute("titulo", "Tabla Eventos");
        model.addAttribute("eventos", listaEvento);
        return "eventos";
    }

    @GetMapping("/eventoN")
    public String crearEvento(Model model) {
        List<Lugar> listaLugares = lugarService.listNombre();
        model.addAttribute("evento", new Evento());
        model.addAttribute("lugares", listaLugares);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento) {
        eventoService.saveEvento(evento);
        return "redirect:/evento";
    }

    @GetMapping("/editEvento/{id}")
    public String editarEvento(@PathVariable("id") Long idEvento, Model model) {
        Evento evento = eventoService.getEventoById(idEvento);
        List<Lugar> listaLugares = lugarService.listNombre();
        model.addAttribute("evento", evento);
        model.addAttribute("lugares", listaLugares);
        return "crear";
    }
    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento) {
      eventoService.delete(idEvento);
        return "redirect:/evento";
    }
}
