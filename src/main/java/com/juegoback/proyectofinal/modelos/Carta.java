package com.juegoback.proyectofinal.modelos;

public class Carta {
    private String nombre;
    private Enumhablidad tipo;
    private int energia;
    private String efecto;

    public Carta(String nombre, Enumhablidad tipo, int energia, String efecto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;
        this.efecto = efecto;
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

}
