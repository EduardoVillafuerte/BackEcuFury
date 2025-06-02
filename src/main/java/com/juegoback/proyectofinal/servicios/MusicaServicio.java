package com.juegoback.proyectofinal.servicios;

import java.util.ArrayList;
import java.util.List;

import com.juegoback.proyectofinal.modelos.ListaCiruclar.ListaCircular;

public class MusicaServicio {
    
    private String[] musicas = {
        "1. Track 1",
        "2. Track 2",
        "3. Track 3",
        "4. Track 4",
        "5. Track 5",   
        "6. Track 6"    
    };
    
    ListaCircular lCircular = new ListaCircular();
    List<String> musicasList = new ArrayList<>();

    public MusicaServicio(){
        for(String musica: musicas){
            lCircular.insertarAlFinal(musica);
        }
    }

    public String obtenerSiguienteCancion() {
        return lCircular.siguiente();
    }

}
