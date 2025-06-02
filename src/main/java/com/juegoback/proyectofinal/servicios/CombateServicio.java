package com.juegoback.proyectofinal.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import com.juegoback.proyectofinal.modelos.Carta;
import com.juegoback.proyectofinal.modelos.Enumhablidad;
import com.juegoback.proyectofinal.modelos.Jugador;

public class CombateServicio {
    
    Jugador jugador = new Jugador(); 
    ArrayList<Carta> cartas = new ArrayList<>();
    private static final int NUMERO_MAXIMO_CARTAS = 5;

    public CombateServicio(){
        cartas.add(crearCarta("Ataque Normal", Enumhablidad.Ataque_normal, 1, "Daño normal",100));
        cartas.add(crearCarta("Ataque Fuerte", Enumhablidad.Ataque_fuerte, 3, "Daño alto",50));
        cartas.add(crearCarta("Defensa", Enumhablidad.Defensa, 1, "Reduce daño",0));
        cartas.add(crearCarta("Curación", Enumhablidad.Soporte, 2, "Recupera vida",0));
        cartas.add(crearCarta("Curación", Enumhablidad.Soporte, 2, "Recupera vida",0));
    }

    public Jugador crearJugdor(String id){ 
        Jugador jugador = new Jugador();
        jugador.setId(id);
        jugador.setEnergia(3);
        jugador.setSalud(100);
        return jugador;
    }

    public Stack<Carta> crearMazo(){
        Stack<Carta> pila = new Stack<>();
        int i = 0;
        Collections.shuffle(cartas);
        for(Carta carta : cartas){
            pila.add(carta);
            i++;
            if(i == NUMERO_MAXIMO_CARTAS )
                return pila;
        }
        return null;
 
    }

    
    private Carta crearCarta(String nombre, Enumhablidad tipo, int energia, String efecto, int dano) {
        Carta carta = new Carta(nombre,tipo,energia,efecto,dano);
        return carta;
    }

}
