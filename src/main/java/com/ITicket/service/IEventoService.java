/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Evento;
import java.util.List;

/**
 *
 * @author Diana Jiménez
 */
public interface IEventoService {
    public List<Evento> getAllEvento();  //Lista de objetos de tipo verdura
    public Evento getEventoById (long id);
    public void saveEvento(Evento evento);  //Nueva fila en la tabla
    public void delete (long id);    //Eliminar fila dado un id
}
