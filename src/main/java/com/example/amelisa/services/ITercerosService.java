package com.example.amelisa.services;

import com.example.amelisa.models.Terceros;

import java.util.List;

public interface ITercerosService {


    public  List<Terceros> ListaTerceros();

    Terceros saveTerceros(Terceros terceros);

    Terceros findById(Integer id);

    Terceros updateTerceros(Terceros terceros);

    public void  deleteById(Integer id);



}
