package com.juegoback.proyectofinal.controladores;

import java.util.ArrayList;
import java.util.List;

import com.juegoback.proyectofinal.modelos.Carta;
import com.juegoback.proyectofinal.modelos.Jugador;
import com.juegoback.proyectofinal.servicios.CombateServicio;
import com.juegoback.proyectofinal.servicios.MusicaServicio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

// Compilar en la carpetar raiz
// ./mvnw spring-boot:run

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class EndPoints {
    CombateServicio combateServicio = new CombateServicio();
    MusicaServicio musicaServicio = new MusicaServicio();

    private Jugador jugador;    
    @GetMapping("/jugador/{id}")
    public ResponseEntity<Jugador> crearJugador(@PathVariable String id){
        jugador = combateServicio.crearJugdor(id);
        //implemetar la base de datos para puntuacion y escalon
        return ResponseEntity.ok(new Jugador(jugador.getId(),jugador.getEnergia(),jugador.getSalud(),jugador.getEscudo(),jugador.getFuerza(),jugador.getAgilidad()));
    }

    @GetMapping("/obtenermazo")
    public List<Carta> crearMazo(){
        ArrayList<Carta> lista = new ArrayList<>();
        for(Carta carta : combateServicio.crearMazo()){
            lista.add(new Carta(carta.getNombre(),carta.getTipo(),carta.getEnergia(),carta.getEfecto(),carta.getDano()));
        }
        return lista;
    }
    
    @GetMapping("/obtenermusica")
    public String obetenerMusica(){
        return musicaServicio.obtenerSiguienteCancion();
    }
    
    
}
