/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Evento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ITicket.repository.EventoRepository;


@Service
public class EventoService implements IEventoService{
    
    @Autowired      //dependencias
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> getAllEvento() {
      return (List<Evento>)eventoRepository.findAll();  //Devuelve toda la lista de verduras
    }

    @Override
    public Evento getEventoById(long id) {
       return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEvento(Evento evento) {
       eventoRepository.save(evento);
    }

    @Override
    public void delete(long id) {
       eventoRepository.deleteById(id);
    }
}
