package com.juegoback.proyectofinal.controladores;

import java.util.ArrayList;
import java.util.List;

import com.juegoback.proyectofinal.modelos.Carta;
import com.juegoback.proyectofinal.modelos.Jugador;
import com.juegoback.proyectofinal.servicios.CombateServicio;
import com.juegoback.proyectofinal.servicios.MusicaServicio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class EndPoints {
    CombateServicio combateServicio = new CombateServicio();
    MusicaServicio musicaServicio = new MusicaServicio();

    private Jugador jugador;    
    @PostMapping("/jugador/{id}")
    public List<Jugador> crearJugador(@PathVariable String id){
        ArrayList<Jugador> lista = new ArrayList<>();
        jugador = combateServicio.crearJugdor(id);
        lista.add(new Jugador(jugador.getId(),jugador.getSalud(),jugador.getEnergia()));
        return lista;
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
