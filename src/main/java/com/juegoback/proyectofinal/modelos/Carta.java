package com.juegoback.proyectofinal.modelos;

public class Carta {
    private String nombre;
    private Enumhablidad tipo;
    private int energia;
    private String efecto;
    private int daño;

    public Carta(String nombre, Enumhablidad tipo, int energia, String efecto, int daño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;
        this.efecto = efecto;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public Enumhablidad getTipo() {
        return tipo;
    }

    public int getEnergia() {
        return energia;
    }

    public String getEfecto() {
        return efecto;
    }
    public int getDano(){
        return daño;
    }

}


