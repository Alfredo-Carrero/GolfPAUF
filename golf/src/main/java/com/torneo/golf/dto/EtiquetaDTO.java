package com.torneo.golf.dto;

import com.torneo.golf.model.Jugador;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

public class EtiquetaDTO {
    private Long id;
    private String descripcion;
    private List<Jugador> jugadores;

    public EtiquetaDTO(){}

    public EtiquetaDTO(Long id, String descripcion, List<Jugador> jugadores) {
        this.id = id;
        this.descripcion = descripcion;
        this.jugadores = jugadores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
