package com.torneo.golf.repository;

import com.torneo.golf.dto.ClasificacionDTO;
import com.torneo.golf.dto.views.JugadorView;
import com.torneo.golf.model.Clasificacion;
import com.torneo.golf.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Long> {


}
