package com.torneo.golf.service;

import com.torneo.golf.dto.views.JugadorView;
import com.torneo.golf.model.Clasificacion;
import com.torneo.golf.model.Etiqueta;
import com.torneo.golf.model.Jugador;
import com.torneo.golf.repository.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionService {
    @Autowired
    private ClasificacionRepository clasificacionRepository;

}
