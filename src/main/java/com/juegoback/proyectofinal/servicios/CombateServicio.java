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
        cartas.add(crearCarta("Golpe Rápido",Enumhablidad.Ataque_normal,1,"Ataque rápido con daño moderado",15));
        cartas.add(crearCarta("Corte Preciso",Enumhablidad.Ataque_normal,1,"Ignora defensa básica del enemigo",20));
        cartas.add(crearCarta("Ataque Fuerte",Enumhablidad.Ataque_fuerte,2,"Causa mucho daño, pero consume más energía",30));
        cartas.add(crearCarta("Explosión Arcana",Enumhablidad.Ataque_fuerte,3,"Inflige daño masivo, pero solo se puede usar una vez por turno",40));        
        cartas.add(crearCarta("Doble Golpe",Enumhablidad.Ataque_normal,2,"Ataca dos veces al mismo enemigo",20));
        cartas.add(crearCarta("Bloqueo Básico",Enumhablidad.Defensa,1,"Reduce el siguiente daño en un 50%",0));
        cartas.add(crearCarta("Contraataque",Enumhablidad.Defensa,2,"Si te atacan este turno, devuelves parte del daño",10));
        cartas.add(crearCarta("Escudo Total",Enumhablidad.Defensa,3,"Bloquea completamente el siguiente ataque",0));
        cartas.add(crearCarta("Absorción",Enumhablidad.Defensa,2,"Bloquea 20 de daño y recupera 10 de vida",0));
        cartas.add(crearCarta("Curación Menor",Enumhablidad.Soporte,1,"Recupera 20 puntos de vida",-15));
        cartas.add(crearCarta("Curación Avanzada",Enumhablidad.Soporte,1,"Recupera bastante vida",-35));
        cartas.add(crearCarta("Inspiración",Enumhablidad.Soporte,1,"Reduce en 1 la energía de tus próximas 2 cartas",0));
        cartas.add(crearCarta("Adrenalina",Enumhablidad.Soporte,1,"Gana 1 punto de energía extra para este turno",15));
        cartas.add(crearCarta("Bendición Vital",Enumhablidad.Soporte,1,"Cura y otorga defensa ligera (10 puntos bloqueados)",-25));
        cartas.add(crearCarta("Golpe Vital",Enumhablidad.Ataque_fuerte,2,"Inflige daño y recupera 10 de vida",25));
    }

    public Jugador crearJugdor(String id){ 
        Jugador jugador = new Jugador();
        jugador.setId(id);
        jugador.setEnergia(4);
        jugador.setSalud(100);
        jugador.setEscudo(5);
        jugador.setFuerza(1);
        jugador.setAgilidad(1);
        return jugador;
    }

    public Stack<Carta> crearMazo(){
        int maxAtaque = 0;
        int maxSoporte = 0;
        int maxDefensa = 0;
        Stack<Carta> pila = new Stack<>();
        int i = 0;
        Collections.shuffle(cartas);
        for(Carta carta : cartas){
            Enumhablidad hEnumhablidad = carta.getTipo();
            
            if(hEnumhablidad == Enumhablidad.Ataque_fuerte || hEnumhablidad == Enumhablidad.Ataque_normal)
                maxAtaque++;
            else if(hEnumhablidad == Enumhablidad.Defensa)
                maxDefensa++;
            else
                maxSoporte++;
        
            if(maxAtaque > 2 && (hEnumhablidad == Enumhablidad.Ataque_fuerte||hEnumhablidad == Enumhablidad.Ataque_normal))
                continue;
            if(maxDefensa > 2 && hEnumhablidad == Enumhablidad.Defensa)
                continue;
            if(maxSoporte > 2 && hEnumhablidad == Enumhablidad.Soporte)
                continue;

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
