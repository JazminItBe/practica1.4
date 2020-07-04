package com.practicalab.models;

import org.dom4j.swing.XMLTableColumnDefinition;

import javax.persistence.*;

@Entity
@Table(name="pedido")

public class pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;

    @Column(name="clave", columnDefinition = "char(60)")
    private char clave;

    @Column(name="color", columnDefinition = "char(60)")
    private char color;

    @Column(name="talla", columnDefinition = "char(15)")
    private char talla;

    @Column(name="cantidad",columnDefinition = "char(50)")
    private char cantidad;

    public pedido() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getClave() {
        return clave;
    }

    public void setClave(char clave) {
        this.clave = clave;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public char getCantidad() {
        return cantidad;
    }

    public void setCantidad(char cantidad) {
        this.cantidad = cantidad;
    }
}
