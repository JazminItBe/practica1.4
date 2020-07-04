package com.practicalab.models;

import org.dom4j.swing.XMLTableColumnDefinition;

import javax.persistence.*;

@Entity
@Table(name="usuario")

public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nombre", columnDefinition = "varchar(60)")
    private String nombre;
    @Column(name="apellido", columnDefinition = "varchar(60)")
    private String apellido;

    @Column(name="tipo", columnDefinition = "char(15)")
    private String tipo;
public usuario() {}

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
