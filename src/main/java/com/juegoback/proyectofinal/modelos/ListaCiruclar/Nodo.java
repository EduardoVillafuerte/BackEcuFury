package com.juegoback.proyectofinal.modelos.ListaCiruclar;

public class Nodo {

    public String dato;
    public Nodo siguiente;

    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}