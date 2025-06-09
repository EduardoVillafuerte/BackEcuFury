package com.juegoback.proyectofinal.modelos;

import java.util.Stack;

public class Jugador {

    private String id;
    private Stack<Carta> mazo = new Stack<>();
    private int energia;
    private int salud;
    private int escudo;
    private int fuerza;
    private int agilidad;
    private int puntuacion;
    private int escalon;

    public Jugador(){}

    public Jugador(String id, int energia, int salud, int escudo, int fuerza, int agilidad) {
        this.id = id;
        this.energia = energia;
        this.salud = salud;
        this.escudo = escudo;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEscalon() {
        return escalon;
    }

    public void setEscalon(int escalon) {
        this.escalon = escalon;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public Stack<Carta> getMazo() {
        return mazo;
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


    