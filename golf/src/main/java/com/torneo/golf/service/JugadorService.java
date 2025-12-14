package com.torneo.golf.service;

import com.torneo.golf.dto.JugadorDTO;
import com.torneo.golf.model.Jugador;
import com.torneo.golf.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public List<JugadorDTO> findAll() {
        return jugadorRepository.findAll()
                .stream()
                .map(u -> new JugadorDTO(u.getId(),u.getNombre(),u.getApellidos(),u.getNacionalidad(),u.getHandicap(),null))
                .toList();
    }

    public JugadorDTO obtenerJugador(Long id) {
        Jugador jugador = jugadorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jugador no encontrado"));
        return new JugadorDTO(
                jugador.getId(),
                jugador.getNombre(),
                jugador.getApellidos(),
                jugador.getNacionalidad(),
                jugador.getHandicap(),
                null
        );
    }

    public List<Jugador> aplicarHandicap(Long torneoId, Integer handicap){
        List<Jugador> jugadores = jugadorRepository.buscarJugadoresPorTorneoSinCompensar(torneoId);

        for(Jugador jugador : jugadores){
                jugador.setHandicap(jugador.getHandicap() - handicap);

                jugador.setApellidos(jugador.getApellidos() + " *");
        }

        return jugadorRepository.saveAll(jugadores);

    }
}
