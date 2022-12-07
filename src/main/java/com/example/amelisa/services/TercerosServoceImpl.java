package com.example.amelisa.services;

import com.example.amelisa.models.Terceros;
import com.example.amelisa.repository.ITercerosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TercerosServoceImpl implements ITercerosService {
    //inyeccion de dependencias el repository
    @Autowired
   private ITercerosRepository tercerosRepository;

//listar
@Override
public List<Terceros> ListaTerceros() {
    return tercerosRepository.findAll();
}

//Guardar
    @Override
    public Terceros saveTerceros(Terceros terceros) {
        return tercerosRepository.save(terceros);
    }

    // por ID
    @Override
    public Terceros findById(Integer id) {
        return tercerosRepository.findById(id).get();
    }

    //ACTUALIZAR
    @Override
    public Terceros updateTerceros(Terceros terceros) {
        return tercerosRepository.save(terceros);
    }

    //Eliminar

    @Override
    public void deleteById(Integer id) {
    tercerosRepository.findById(id);
    }


}
