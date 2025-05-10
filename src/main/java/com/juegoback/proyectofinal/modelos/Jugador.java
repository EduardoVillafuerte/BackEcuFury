package com.juegoback.proyectofinal.modelos;

import java.util.Stack;

public class Jugador {
    
    private String id;
    private Stack<Carta> mazo = new Stack<>();
    private int energia;
    private int salud;
    private int escudo;
    private int puntuacion;
    private int escalon; 
    
    public Jugador(){}
    
    public Jugador(String id, int salud, int energia) {
        this.id = id;
        this.salud = salud;
        this.energia = energia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMazo(Stack<Carta> mazo) {
        this.mazo = mazo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

}
    