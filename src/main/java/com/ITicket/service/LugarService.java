/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Lugar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ITicket.repository.LugarRepository;


@Service
public class LugarService implements ILugarService {
    
    @Autowired
    private LugarRepository lugarRepository;
    
    @Override
    public List<Lugar> listNombre(){
        return (List<Lugar>)lugarRepository.findAll();}
}
