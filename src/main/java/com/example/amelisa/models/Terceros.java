package com.example.amelisa.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "terceros")
public class Terceros implements Serializable {
    private  static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombres", length = 255, nullable = false)
    private  String nombre;

    @Column(name="documento",length = 20, nullable = false, unique = true)
    private String documento;

    @Column(name = "direccion", length = 255, nullable = false)
    private String direccion;

    public Terceros() {
    }

    public Terceros(int id, String nombre, String documento, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
