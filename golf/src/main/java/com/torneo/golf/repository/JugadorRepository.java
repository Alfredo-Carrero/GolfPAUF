package com.torneo.golf.repository;

import com.torneo.golf.model.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
    @Query(value = "SELECT j.* FROM golf.jugadores j " +
            "JOIN golf.clasificaciones c ON j.id = c.jugador_id " +
            "WHERE c.torneo_id = :torneoId " +
            "AND j.apellidos NOT LIKE '% *'", nativeQuery = true)
    List<Jugador> buscarJugadoresPorTorneoSinCompensar(@Param("torneoId") Long torneoId);
}