package com.torneo.golf.repository;

import com.torneo.golf.model.Clasificacion;
import com.torneo.golf.model.Torneo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TorneoRepository extends JpaRepository<Torneo, Long> {
    @Query("SELECT t FROM Torneo t WHERE t.lugar LIKE CONCAT('%', :lugar, '%')")
    List<Torneo> buscarTorneos(@Param("lugar") String lugar);

    @Query(value = "SELECT posicion, jugador_id, torneo_id FROM golf.clasificaciones " +
            "WHERE torneo_id = :torneoId", nativeQuery = true)
    List<Clasificacion> obtenerClasificacionTorneo(@Param("torneoId") Long torneoId);

}
