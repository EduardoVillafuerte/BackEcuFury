package com.juegoback.proyectofinal.modelos.ListaCiruclar;

public class ListaCircular {
    private Nodo primero = null;
    private Nodo ultimo = null;
    private Nodo actual = null;

    public void insertarAlFinal(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
            nuevo.siguiente = nuevo; 
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
    }

    public String siguiente() {
        if (primero == null) return null;

        if (actual == null) {
            actual = primero;
        } else {
            actual = actual.siguiente;
        }

        return actual.dato;
    }
}