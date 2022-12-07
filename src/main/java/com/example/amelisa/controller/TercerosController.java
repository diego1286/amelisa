package com.example.amelisa.controller;


import com.example.amelisa.models.Terceros;
import com.example.amelisa.services.ITercerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TercerosController {

    //se inyecta el repositorio del servicio
    @Autowired
    private ITercerosService tercerosService;

    @GetMapping("/terceros")
    public String listTerceros(Model model) {
        model.addAttribute("listTerceros", tercerosService.ListaTerceros());
        return "terceros";
    }

    @GetMapping("/save")
    public String formsRegis(Model model, @ModelAttribute("mensaje") String mensaje) {
        Terceros terceros = new Terceros();
        model.addAttribute("terceros", terceros);
        model.addAttribute("mensaje", mensaje);
        return "createTerceros";
    }

    //guardar desde el controlller
    @PostMapping("/terceros")
    public String saveTerceros(@ModelAttribute("terceros") Terceros terceros) {
        tercerosService.saveTerceros(terceros);
        return "redirect:/terceros";
    }

    //editar terceros

    @GetMapping("/terceros/editar/{id}")
    public String editForms(@PathVariable Integer id, Model model) {
        model.addAttribute("terceros", tercerosService.findById(id));
        return "editTerceros";
    }

    @PostMapping("/terceros/{id}")
    public  String editTerceros(@PathVariable Integer id, @ModelAttribute("terceros") Terceros terceros, Model model){
        Terceros existTercero = tercerosService.findById(id);
        existTercero.setId(id);
        existTercero.setNombre(terceros.getNombre());
        existTercero.setDocumento(terceros.getDocumento());
        existTercero.setDireccion(terceros.getDireccion());
        tercerosService.updateTerceros(existTercero);
        return "redirect:/terceros";
    }

    @GetMapping("/terceros/{id}")
    public  String eliminarTercero(@PathVariable Integer id){
        tercerosService.deleteById(id);
        return "redirect:/terceros";
    }


}
