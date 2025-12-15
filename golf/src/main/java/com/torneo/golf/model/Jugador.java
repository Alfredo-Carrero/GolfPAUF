package com.torneo.golf.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private String nacionalidad;

    @Column(nullable = false)
    private Integer handicap;

    @OneToMany(mappedBy = "jugador")
    private Set<Clasificacion> clasificaciones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etiqueta_id", nullable = false)
    private Etiqueta etiqueta;

    public Jugador() {
    }

    public Jugador(String nombre, String apellidos, String nacionalidad, Integer handicap, Etiqueta etiqueta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.handicap = handicap;
        this.etiqueta = etiqueta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getHandicap() {
        return handicap;
    }

    public void setHandicap(Integer handicap) {
        this.handicap = handicap;
    }

    public Set<Clasificacion> getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(Set<Clasificacion> clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }
}