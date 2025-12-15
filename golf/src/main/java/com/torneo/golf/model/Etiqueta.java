package com.torneo.golf.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descripcion;

    @OneToMany(mappedBy = "etiqueta",
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.LAZY)
    private List<Jugador> jugadores;

    public Etiqueta(){}

    public Etiqueta(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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

//    public List<Jugador> getJugadores() {
//        return jugadores;
//    }
//
//    public void setJugadores(List<Jugador> jugadores) {
//        this.jugadores = jugadores;
//    }
}
